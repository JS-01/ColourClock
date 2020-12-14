/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colourclock;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jrshu
 */
public class ClockGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClockGUI
     */
    public static int CurrentHours;
    public static int CurrentMinutes;
    public static int CurrentSeconds;

    public ClockGUI() {
        initComponents();

        Thread t = new Thread() {

            public void run() {

                while (true) {
                    GetCurrentHours();
                    GetCurrentMinutes();
                    GetCurrentSeconds();

                    Time.setText(CurrentHours + ":" + CurrentMinutes + ":" + CurrentSeconds);

                    Color Current = new Color((CurrentHours), (CurrentMinutes), (CurrentSeconds));

                    Time.setForeground(Current);

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
        };

        t.start();
    }

    public static void GetCurrentHours() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        LocalDateTime CurrentTime = LocalDateTime.now();

        CurrentHours = Integer.parseInt(dtf.format(CurrentTime));
    }

    public static void GetCurrentMinutes() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm");
        LocalDateTime CurrentTime = LocalDateTime.now();

        CurrentMinutes = Integer.parseInt(dtf.format(CurrentTime));
    }

    public static void GetCurrentSeconds() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss");
        LocalDateTime CurrentTime = LocalDateTime.now();

        CurrentSeconds = Integer.parseInt(dtf.format(CurrentTime));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Time = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Time.setFont(new java.awt.Font("OCR A Extended", 1, 60)); // NOI18N
        Time.setForeground(new java.awt.Color(51, 255, 0));
        Time.setText("aidnadnawnwa");
        getContentPane().add(Time);
        Time.setBounds(40, 124, 590, 280);
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(40, 0, 495, 262);

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
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel Time;
    // End of variables declaration//GEN-END:variables
}