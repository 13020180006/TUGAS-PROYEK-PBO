/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Jumat, 19 Juni 2020
    Waktu	: 15.13 WITA
*/
package View;

public class JmlPegawai extends javax.swing.JFrame {

    
    public JmlPegawai() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OK = new javax.swing.JButton();
        txtJumlahPegawai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Proyek PBO (Paramadina Mulya / 13020180006)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OK.setBackground(new java.awt.Color(0, 0, 153));
        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-checked-checkbox-64.png"))); // NOI18N
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 60, 50));

        txtJumlahPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlahPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 250, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/INPUT JUMLAH PEGAWAI.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahPegawaiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtJumlahPegawaiActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // TODO add your handling code here:
        String Sinput = txtJumlahPegawai.getText();
        new InputData(Sinput).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_OKActionPerformed

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
            java.util.logging.Logger.getLogger(JmlPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JmlPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JmlPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JmlPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JmlPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtJumlahPegawai;
    // End of variables declaration//GEN-END:variables
}
