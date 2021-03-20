/*
Haz una nueva versión del programa anterior con un menú superior llamado Config con 3
opciones, una para establecer el número de móvil, otra para el coste de establecimiento de llamada
y una última para establecer el coste por minuto de llamada. Pueden ser necesarios setters en la
clase MovilPrepago_v3

Fecha: 20/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package rcm12;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author rchamac
 */
public class RCMt12e06 extends javax.swing.JFrame {

   static MovilPrepago_v3 movil;
   static int Numero;
   static String saldo;
   static LocalDateTime iniciollamada;
   
   public RCMt12e06() {
        initComponents();
        
        
      movil = new MovilPrepago_v3(0,0f,0f,0.01f,100); // llamo al constructor de movilPrepago_v3
      // jLabel3.setText("Telefono: "+String.valueOf(movil.numeroMovil)); // En la etiquera pongo en número de teléfono
         saldo = String.valueOf(movil.consultarSaldo()); //Obtengo el saldo en la variable saldo
        jTextField1.setText(saldo);
        //No habilito los botones hasta introducir el número de telefono
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Llamar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Colgar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saldo");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Recargar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu4.setText("Config");
        jMenu4.setAutoscrolls(true);

        jMenuItem1.setText("Número de móvil");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Establecer llamada");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Coste Minuto Llamada");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addComponent(jButton3)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON LLAMAR//
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       iniciollamada = LocalDateTime.now();
       jButton1.setEnabled(false);  //-- deshabilitar llamar
       jButton2.setEnabled(true);   //-- habilitamos colgar
       jButton3.setEnabled(false);  //-- deshabilitar recargar
    
    }//GEN-LAST:event_jButton1ActionPerformed

    
    //BOTON COLGAR//
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        long tiempo = ChronoUnit.SECONDS.between(iniciollamada,LocalDateTime.now());
        String temp = String.valueOf(tiempo);
        String msg = String.format("Duracción de la llamada: " + temp + " segundos");
        JOptionPane.showMessageDialog(this, msg);
        movil.efectuarLlamada((int)tiempo);
        float aux = movil.consultarSaldo();
        String txt = String.format("%.2f",aux);
        jTextField1.setText(txt);
        jButton1.setEnabled(true);    //-- habilitar llamar
        jButton2.setEnabled(false);   //-- deshabilitamos colgar
        jButton3.setEnabled(true);    //-- habilitar recargar

    }//GEN-LAST:event_jButton2ActionPerformed

    
    //BOTON RECARGAR//
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String txt = JOptionPane.showInputDialog(this, "Saldo a recargar:");
       int importe = Integer.parseInt(txt);
       movil.recargar(importe);
       jTextField1.setText(String.valueOf(movil.consultarSaldo()));
    }//GEN-LAST:event_jButton3ActionPerformed

    
     // MENU NUMERO MOVIL
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String txt = JOptionPane.showInputDialog(this, "Número de móvil:");
        movil.numeroMovil = Integer.parseInt(txt);
        jLabel3.setText("Telefono: "+String.valueOf(movil.numeroMovil)); // En la etiquera pongo en número de teléfono
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    // MENU ESTABLECER LLAMADA
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String txt = JOptionPane.showInputDialog(this, "Precio estlecimiento de llamada:");
        float estLlam = Float.parseFloat(txt);
        movil.setCosteEstablecLlamada(estLlam);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //MENU MINUTO LLAMADA
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String txt = JOptionPane.showInputDialog(this, "Precio  de llamada:");
        float minLlam = Float.parseFloat(txt);
        movil.setCosteMinutoLlamada(minLlam);
        
      
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RCMt12e06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RCMt12e06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RCMt12e06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RCMt12e06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RCMt12e06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
