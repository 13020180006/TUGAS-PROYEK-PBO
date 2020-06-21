
package View;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HitungGajiPegawai = new javax.swing.JButton();
        InputDataPegawai = new javax.swing.JButton();
        LihatDataPegawai = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Proyek PBO (Paramadina Mulya / 13020180006)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HitungGajiPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-paycheque-64.png"))); // NOI18N
        HitungGajiPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungGajiPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(HitungGajiPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        InputDataPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-input-64.png"))); // NOI18N
        InputDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDataPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(InputDataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        LihatDataPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-management-64.png"))); // NOI18N
        LihatDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatDataPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(LihatDataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        Keluar.setBackground(new java.awt.Color(153, 204, 255));
        Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-exit-sign-40.png"))); // NOI18N
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 50, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDataPegawaiActionPerformed
        // TODO add your handling code here:
        JmlPegawai jp = new JmlPegawai();
        jp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InputDataPegawaiActionPerformed

    private void LihatDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatDataPegawaiActionPerformed
        try {
            // TODO add your handling code here:
            DataPegawai dp = new DataPegawai();
            dp.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LihatDataPegawaiActionPerformed

    private void HitungGajiPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungGajiPegawaiActionPerformed
        // TODO add your handling code here:
        HitungGajiPegawai hgp = new HitungGajiPegawai();
        hgp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HitungGajiPegawaiActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HitungGajiPegawai;
    private javax.swing.JButton InputDataPegawai;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton LihatDataPegawai;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
