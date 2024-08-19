package packagepar;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Registro {

    private String cedula;
    private String placa;
    private String tipo;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Registro(String cedula, String placa, String tipo) throws IllegalArgumentException {
        this.cedula = cedula;
        this.tipo = tipo;
        
        if (esPlacaValida(placa, tipo)) {
            this.placa = placa;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de placa incorrecto para " + tipo, "Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Formato de placa incorrecto.");
        }
        
        this.horaEntrada = LocalTime.now();
    }

    private boolean esPlacaValida(String placa, String tipo) {
        if (tipo.equalsIgnoreCase("Carro")) {
            return placa.matches("^[A-Z]{3}\\d{3}$");  
        } else if (tipo.equalsIgnoreCase("Moto")) {
            return placa.matches("^[A-Z]{2}\\d{3}$");  
        }
        return false;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (esPlacaValida(placa, tipo)) {
            this.placa = placa;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de placa incorrecto para " + tipo, "Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Formato de placa incorrecto.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHoraEntrada() {
        return horaEntrada.format(FORMATTER);
    }

    public String getHoraSalida() {
        return horaSalida != null ? horaSalida.format(FORMATTER) : null; 
    }

    public void registrarSalida() {
        this.horaSalida = LocalTime.now();
    }

    public double calcularTarifa() {
        if (horaSalida == null) {
            return 0; 
        }

        Duration duracion = Duration.between(horaEntrada, horaSalida);
        long minutos = duracion.toMinutes();
        double tarifa;

        if (tipo.equalsIgnoreCase("Carro")) {
            tarifa = minutos * 0.05; 
        } else if (tipo.equalsIgnoreCase("Moto")) {
            tarifa = minutos * 0.03;
        } else {
            tarifa = 0;
        }

        return tarifa;
    }
}

