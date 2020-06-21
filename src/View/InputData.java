/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Jumat, 19 Juni 2020
    Waktu	: 00.12 WITA
*/

package View;
import Source.ImplementPegawai;
import Source.InterfacePegawai;
import Source.KoneksiDB;
import Source.Pegawai;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InputData extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    InterfacePegawai interfacePegawai;
    List record = new ArrayList();
    int baris;
    String kGol;
    String PindahKesebelah;
    int i = 1;
    
    public InputData() {
        
    }
    
    public InputData(String UdahPindah){
        initComponents();
        KoneksiDB.getConnection();
        interfacePegawai = new ImplementPegawai();
              Simpan.setEnabled(true);
              daftarGolongan();
        this.PindahKesebelah=UdahPindah;

    }
    void daftarGolongan() { 
        Object[] gol = {"1", "2", "3", "4", "5"};
        for (int i = 0; i < gol.length; i++) { 
            CbGolongan.addItem(gol[i].toString()); 
        } 
        kGol = CbGolongan.getSelectedItem().toString(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtJamKerja = new javax.swing.JTextField();
        txtNip = new javax.swing.JTextField();
        txtNamaPegawai = new javax.swing.JTextField();
        CbGolongan = new javax.swing.JComboBox<>();
        txtLembur = new javax.swing.JTextField();
        txtGajiPokok = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Proyek PBO (Paramadina Mulya / 13020180006)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtJamKerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 230, 30));
        getContentPane().add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 360, 30));
        getContentPane().add(txtNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 360, 30));

        getContentPane().add(CbGolongan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 230, 40));
        getContentPane().add(txtLembur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 230, 30));
        getContentPane().add(txtGajiPokok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 360, 30));

        Simpan.setFont(new java.awt.Font("Apricity", 0, 18)); // NOI18N
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-save-as-64.png"))); // NOI18N
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/INPUT DATA PEGAWAI.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNip.getText().equals("") && txtNamaPegawai.getText().equals("") && txtGajiPokok.getText().equals("") 
                    && CbGolongan.getSelectedItem().equals("") && txtJamKerja.getText().equals("") && txtLembur.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "silahkan isi data yang akan ditambah");
            } else {
                //Integer.parseInt(txtGajiPokok);
                Pegawai p = new Pegawai();
                p.setNip(txtNip.getText());
                p.setNama_Pegawai(txtNamaPegawai.getText());
                p.setGaji_Pokok(txtGajiPokok.getText());
                p.setGolongan((String) CbGolongan.getSelectedItem());
                p.setJam_Kerja(txtJamKerja.getText());
                p.setLembur(txtLembur.getText());
                interfacePegawai.insert(p);
                JOptionPane.showMessageDialog(this, "Data tersimpan");
                //bersih();
                this.setVisible(false);
            }
            int input = Integer.parseInt((PindahKesebelah));
                
                if(i != input){
                    i++;
                    this.setVisible(true);
                    txtNip.setText("");
                    txtGajiPokok.setText("");
                    txtNamaPegawai.setText("");
                    txtJamKerja.setText("");
                    txtLembur.setText("");
                    CbGolongan.setSelectedIndex(0);
                }else{
                    
                    Menu m = new Menu();
                    m.setVisible(true); 
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_SimpanActionPerformed

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
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbGolongan;
    private javax.swing.JButton Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtGajiPokok;
    private javax.swing.JTextField txtJamKerja;
    private javax.swing.JTextField txtLembur;
    private javax.swing.JTextField txtNamaPegawai;
    private javax.swing.JTextField txtNip;
    // End of variables declaration//GEN-END:variables
}
