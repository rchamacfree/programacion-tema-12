/*
Ejercicio guiado Buscaminas

Fecha: 20/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package rcm12;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class RCMt12e11 extends javax.swing.JFrame {

    private BuscaMinas juego;
    private JButton tablero[][];

    public RCMt12e11() {
 
              initComponents();
        tablero = new JButton[8][8];
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                tablero[f][c] = new JButton();
                tablero[f][c].setFont(new java.awt.Font("Tahoma", 0, 36));
                tablero[f][c].addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        FActionPerformed(evt);
                    }
                });
                tablero[f][c].setName(Integer.toString(f) + Integer.toString(c));
                tablero[f][c].setBackground(Color.white);
                tablero[f][c].setText("");
                PanelBotones.add(tablero[f][c]);
            }
        }
        this.juego = new BuscaMinas(8, 8, 8);
    }  
        
        
        
           private void FActionPerformed(java.awt.event.ActionEvent evt) {
        String nn = ((JButton) evt.getSource()).getName();
        int fila = Integer.parseInt(nn.substring(0, 1));
        int col = Integer.parseInt(nn.substring(1, 2));

        int x = juego.elegir(fila, col);
        if (x == -1) { //perdiste
            ((JButton) evt.getSource()).setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Has perdido");
            System.exit(0);
        } else {
            for (int f = 0; f < 8; f++) {
                for (int c = 0; c < 8; c++) {
                    if (juego.casillas[f][c].descubierta) {
                        tablero[f][c].setText(Integer.toString(juego.casillas[f][c].valor));
                        tablero[f][c].setBackground(Color.yellow);
                    }
                }
            }
            if (juego.ganaste()) {
                JOptionPane.showMessageDialog(this, "Has ganado");
                System.exit(0);
            }
        }
    } 
        
        
        
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInferior = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelInferior.setPreferredSize(new java.awt.Dimension(500, 50));
        getContentPane().add(PanelInferior, java.awt.BorderLayout.PAGE_END);

        PanelBotones.setPreferredSize(new java.awt.Dimension(500, 500));
        PanelBotones.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(PanelBotones, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RCMt12e11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RCMt12e11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RCMt12e11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RCMt12e11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RCMt12e11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelInferior;
    // End of variables declaration//GEN-END:variables
}
