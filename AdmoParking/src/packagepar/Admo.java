package packagepar;

import java.util.*;
import javax.swing.JButton;

public class Admo extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    private final Espacio espacio;
    private Registro Registro;

    public Admo() {

        initComponents();
        h1 = new Thread(this);
        h1.start();
        JButton[] botones = new JButton[]{bnp1, bnp2, bnp3, bnp4, bnp5, bnp6, bnp7, bnp8, bnp9, bnp10, bnp11, bnp12, bnp13, bnp14, bnp15};
        espacio = new Espacio(botones);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RBTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bnp6 = new javax.swing.JButton();
        Placa = new javax.swing.JTextField();
        bnp8 = new javax.swing.JButton();
        bnp2 = new javax.swing.JButton();
        bnp5 = new javax.swing.JButton();
        bnp7 = new javax.swing.JButton();
        bnp3 = new javax.swing.JButton();
        bnp10 = new javax.swing.JButton();
        bnp9 = new javax.swing.JButton();
        bnp4 = new javax.swing.JButton();
        bnp1 = new javax.swing.JButton();
        bning = new javax.swing.JButton();
        bnsalida = new javax.swing.JButton();
        RBCarro = new javax.swing.JRadioButton();
        RBMoto = new javax.swing.JRadioButton();
        bnp11 = new javax.swing.JButton();
        bnp12 = new javax.swing.JButton();
        bnp13 = new javax.swing.JButton();
        bnp14 = new javax.swing.JButton();
        bnp15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 26)); // NOI18N
        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        bnp6.setBackground(java.awt.Color.green);
        bnp6.setText("P6");
        bnp6.setActionCommand("p1");
        jPanel1.add(bnp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 80, 60));

        Placa.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaActionPerformed(evt);
            }
        });
        jPanel1.add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 180, 30));

        bnp8.setBackground(java.awt.Color.green);
        bnp8.setText("P8");
        bnp8.setActionCommand("p1");
        jPanel1.add(bnp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 80, 60));

        bnp2.setBackground(java.awt.Color.green);
        bnp2.setText("P2");
        bnp2.setActionCommand("p1");
        jPanel1.add(bnp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 80, 60));

        bnp5.setBackground(java.awt.Color.green);
        bnp5.setText("P5");
        bnp5.setActionCommand("p1");
        jPanel1.add(bnp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 80, 60));

        bnp7.setBackground(java.awt.Color.green);
        bnp7.setText("P7");
        bnp7.setActionCommand("p1");
        jPanel1.add(bnp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 80, 60));

        bnp3.setBackground(java.awt.Color.green);
        bnp3.setText("P3");
        bnp3.setActionCommand("p1");
        jPanel1.add(bnp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 80, 60));

        bnp10.setBackground(java.awt.Color.green);
        bnp10.setText("P10");
        bnp10.setActionCommand("p1");
        jPanel1.add(bnp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 80, 60));

        bnp9.setBackground(java.awt.Color.green);
        bnp9.setText("P9");
        bnp9.setActionCommand("p1");
        jPanel1.add(bnp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 80, 60));

        bnp4.setBackground(java.awt.Color.green);
        bnp4.setText("P4");
        bnp4.setActionCommand("p1");
        jPanel1.add(bnp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 80, 60));

        bnp1.setBackground(java.awt.Color.green);
        bnp1.setText("P1");
        bnp1.setActionCommand("p1");
        bnp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnp1ActionPerformed(evt);
            }
        });
        jPanel1.add(bnp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 80, 60));

        bning.setBackground(new java.awt.Color(0, 204, 102));
        bning.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        bning.setForeground(new java.awt.Color(255, 255, 255));
        bning.setText("Ingresar");
        bning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bningActionPerformed(evt);
            }
        });
        jPanel1.add(bning, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        bnsalida.setBackground(new java.awt.Color(0, 204, 102));
        bnsalida.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        bnsalida.setForeground(new java.awt.Color(255, 255, 255));
        bnsalida.setText("Salida");
        bnsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsalidaActionPerformed(evt);
            }
        });
        jPanel1.add(bnsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        RBCarro.setBackground(new java.awt.Color(255, 255, 255));
        RBTipo.add(RBCarro);
        RBCarro.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        RBCarro.setText("Carro");
        RBCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBCarroActionPerformed(evt);
            }
        });
        jPanel1.add(RBCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        RBMoto.setBackground(new java.awt.Color(255, 255, 255));
        RBTipo.add(RBMoto);
        RBMoto.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        RBMoto.setText("Moto");
        jPanel1.add(RBMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        bnp11.setBackground(java.awt.Color.green);
        bnp11.setText("P11");
        bnp11.setActionCommand("p1");
        jPanel1.add(bnp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, 60));

        bnp12.setBackground(java.awt.Color.green);
        bnp12.setText("P12");
        bnp12.setActionCommand("p1");
        jPanel1.add(bnp12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 80, 60));

        bnp13.setBackground(java.awt.Color.green);
        bnp13.setText("P13");
        bnp13.setActionCommand("p1");
        jPanel1.add(bnp13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 80, 60));

        bnp14.setBackground(java.awt.Color.green);
        bnp14.setText("P14");
        bnp14.setActionCommand("p1");
        jPanel1.add(bnp14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 80, 60));

        bnp15.setBackground(java.awt.Color.green);
        bnp15.setText("P15");
        bnp15.setActionCommand("p1");
        jPanel1.add(bnp15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 80, 60));

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 26)); // NOI18N
        jLabel2.setText("Cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        Cedula.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 180, 30));

        jTextField2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jTextField2.setText("$");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 160, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cobro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 26)); // NOI18N
        jLabel3.setText("Tipo ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 26)); // NOI18N
        jLabel5.setText("Hora");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        lblReloj.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblReloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblRelojActionPerformed(evt);
            }
        });
        jPanel1.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagepar/Administrador BG.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bningActionPerformed

        String cedula = Cedula.getText();
        String placa = Placa.getText();

        String tipo = null;
        if (RBCarro.isSelected()) {
            tipo = RBCarro.getText();
        } else if (RBMoto.isSelected()) {
            tipo = RBMoto.getText();
        }

        Registro registro = new Registro(cedula, placa, tipo);
        espacio.manejarIngreso(registro);


    }//GEN-LAST:event_bningActionPerformed

    private void bnsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsalidaActionPerformed

        espacio.manejarSalida();


    }//GEN-LAST:event_bnsalidaActionPerformed

    private void RBCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBCarroActionPerformed

    private void PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaActionPerformed

    private void lblRelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblRelojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRelojActionPerformed

    private void bnp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        espacio.manejarSalida();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Admo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Placa;
    private javax.swing.JRadioButton RBCarro;
    private javax.swing.JRadioButton RBMoto;
    private javax.swing.ButtonGroup RBTipo;
    private javax.swing.JButton bning;
    private javax.swing.JButton bnp1;
    private javax.swing.JButton bnp10;
    private javax.swing.JButton bnp11;
    private javax.swing.JButton bnp12;
    private javax.swing.JButton bnp13;
    private javax.swing.JButton bnp14;
    private javax.swing.JButton bnp15;
    private javax.swing.JButton bnp2;
    private javax.swing.JButton bnp3;
    private javax.swing.JButton bnp4;
    private javax.swing.JButton bnp5;
    private javax.swing.JButton bnp6;
    private javax.swing.JButton bnp7;
    private javax.swing.JButton bnp8;
    private javax.swing.JButton bnp9;
    private javax.swing.JButton bnsalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lblReloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == h1) {
            calcula();
            lblReloj.setText(hora + ":" + minutos + ":" + segundos + "  " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
}
