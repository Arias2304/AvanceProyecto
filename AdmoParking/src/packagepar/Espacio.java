package packagepar;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Espacio {

    private final JButton[] botones;
    private int BotonLibre;
    private int BotonOcupado;
    private final Registro[] registros;

    public Espacio(JButton[] botones) {
        this.botones = botones;
        this.BotonLibre = 0;
        this.BotonOcupado = -1;
        this.registros = new Registro[botones.length];
        agregarActionListeners();
    }

    private void agregarActionListeners() {
        for (int i = 0; i < botones.length; i++) {
            final int index = i;
            botones[i].addActionListener(e -> VerInfo(index));
        }
    }

    private void VerInfo(int index) {
        Registro registro = registros[index];
        if (registro != null) {
            String mensaje = "Placa: " + registro.getPlaca() + "\n"
                    + "Tipo vehículo: " + registro.getTipo() + "\n"
                    + "Cédula: " + registro.getCedula() + "\n"
                    + "Hora de Entrada: " + registro.getHoraEntrada();
            JOptionPane.showMessageDialog(null, mensaje, "Información del Espacio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Este espacio está libre.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void manejarIngreso(Registro registro) {
        if (BotonLibre < botones.length) {
            JButton boton = botones[BotonLibre];
            registros[BotonLibre] = registro;
            boton.setBackground(Color.red);
            boton.setText("ocupado");

            BotonLibre++;
        } else {
            JOptionPane.showMessageDialog(null, "No hay más espacios libres.");
        }
    }

    public void manejarSalida() {
        if (BotonLibre > 0) {
            int index = BotonLibre - 1;
            Registro registro = registros[index];
            registro.registrarSalida();

            double tarifa = registro.calcularTarifa();

            JOptionPane.showMessageDialog(null, "La tarifa a cobrar es: $" + tarifa, "Cobro", JOptionPane.INFORMATION_MESSAGE);

            JButton boton = botones[index];
            boton.setBackground(Color.green);
            boton.setText("libre");

            registros[index] = null;
            BotonLibre--;
        } else {
            JOptionPane.showMessageDialog(null, "Todos los espacios están libres.");
        }

    }
}
