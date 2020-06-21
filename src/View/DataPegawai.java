/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 18 Juni 2020
    Waktu	: 23.30 WITA
*/
package View;

import Source.ImplementPegawai;
import Source.InterfacePegawai;
import Source.KoneksiDB;
import Source.Pegawai;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataPegawai extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    InterfacePegawai interfacePegawai;
    List record = new ArrayList();
    int baris;
    
    
    public DataPegawai() throws SQLException {
        initComponents();
        KoneksiDB.getConnection();
        interfacePegawai = new ImplementPegawai();
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
        ambil_data();
        daftarGolongan();
    }
    
    void daftarGolongan() { 
        Object[] gol = {"1", "2", "3", "4", "5"};
        for (int i = 0; i < gol.length; i++) { 
            CbGolongan.addItem(gol[i].toString()); 
        } 
        String kGol = CbGolongan.getSelectedItem().toString(); 
    }
    
    public void ambil_data() {
        try {
            record = interfacePegawai.getAll();
            Object data[][] = new Object[record.size()][6];
            int x = 0;
            for (Iterator it = record.iterator(); it.hasNext();) {
                Pegawai p = (Pegawai) it.next();
                data[x][0] = p.getNip();
                data[x][1] = p.getNama_Pegawai();
                data[x][2] = p.getGaji_Pokok();
                data[x][3] = p.getGolongan();
                data[x][4] = p.getJam_Kerja();
                data[x][5] = p.getLembur();
                x++;
            }
            String judul[] = {"NIP", "NAMA PEGAWAI", "GAJI POKOK", "GOLONGAN", "JAM KERJA", "LEMBUR"};
            jTable1.setModel(new DefaultTableModel(data, judul));
            jScrollPane1.setViewportView(jTable1);
        } catch (SQLException ex){
            Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void loadData() { 
        try { 
            record = interfacePegawai.getAll(); 
        } catch (SQLException ex) { 
            Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNip = new javax.swing.JTextField();
        txtNamaPegawai = new javax.swing.JTextField();
        txtGajiPokok = new javax.swing.JTextField();
        CbGolongan = new javax.swing.JComboBox<>();
        txtJamKerja = new javax.swing.JTextField();
        txtLembur = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Kembali = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Proyek PBO (Paramadina Mulya / 13020180006)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNipActionPerformed(evt);
            }
        });
        getContentPane().add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 360, 30));

        txtNamaPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(txtNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 360, 30));

        txtGajiPokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGajiPokokActionPerformed(evt);
            }
        });
        getContentPane().add(txtGajiPokok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 360, 30));

        CbGolongan.setToolTipText("");
        CbGolongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbGolonganActionPerformed(evt);
            }
        });
        getContentPane().add(CbGolongan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 230, 40));

        txtJamKerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamKerjaActionPerformed(evt);
            }
        });
        getContentPane().add(txtJamKerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 230, 30));

        txtLembur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLemburActionPerformed(evt);
            }
        });
        getContentPane().add(txtLembur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 230, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "NAMA PEGAWAI", "GAJI POKOK", "GOLONGAN", "JAM KERJA", "LEMBUR"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 800, 110));

        Kembali.setFont(new java.awt.Font("Apricity", 0, 18)); // NOI18N
        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-back-64.png"))); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, 60));

        Hapus.setFont(new java.awt.Font("Apricity", 0, 18)); // NOI18N
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-bin-64.png"))); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, 60));

        Edit.setFont(new java.awt.Font("Apricity", 0, 18)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-edit-64.png"))); // NOI18N
        Edit.setText("EDIT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DATA PEGAWAI.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String nipAwal;
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        try { 
            Pegawai pgw = new Pegawai(); 
            pgw.setNip(txtNip.getText().trim()); 
            pgw.setNama_Pegawai(txtNamaPegawai.getText().trim()); 
            pgw.setGaji_Pokok(txtGajiPokok.getText().trim()); 
            pgw.setGolongan(String.valueOf(CbGolongan.getSelectedItem()).trim()); 
            pgw.setJam_Kerja(txtJamKerja.getText().trim()); 
            pgw.setLembur(txtLembur.getText().trim()); 
            interfacePegawai.update(pgw, nipAwal); 
            JOptionPane.showMessageDialog(this, "data berhasil diubah");
            ambil_data();
        } catch (SQLException ex) { 
            System.out.println(""+ex.getMessage());
            Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_EditActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_KembaliActionPerformed

    private void txtNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNipActionPerformed
        // TODO add your handling code here:
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_txtNipActionPerformed

    private void txtNamaPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPegawaiActionPerformed
        // TODO add your handling code here:
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_txtNamaPegawaiActionPerformed

    private void txtGajiPokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGajiPokokActionPerformed
        // TODO add your handling code here:
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_txtGajiPokokActionPerformed

    private void CbGolonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbGolonganActionPerformed
        // TODO add your handling code here:
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_CbGolonganActionPerformed

    private void txtJamKerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamKerjaActionPerformed
        // TODO add your handling code here:
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_txtJamKerjaActionPerformed

    private void txtLemburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLemburActionPerformed
        // TODO add your handling code here:
        Edit.setEnabled(true);
        Hapus.setEnabled(true);
    }//GEN-LAST:event_txtLemburActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        try { 
            String Nip = txtNip.getText(); 
            interfacePegawai.delete(Nip); 
             ambil_data ();
             txtNip.setText("");
             txtGajiPokok.setText("");
             txtNamaPegawai.setText("");
             txtJamKerja.setText("");
             txtLembur.setText("");
             CbGolongan.setSelectedIndex(0);
            JOptionPane.showMessageDialog(this, "data berhasil dihapus"); 
        } catch (SQLException ex) { 
            Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();

    String kolom1 = jTable1.getValueAt(baris, 0).toString();
    String kolom2 = jTable1.getValueAt(baris, 1).toString();
    String kolom3 = jTable1.getValueAt(baris, 2).toString();
    String kolom4 = jTable1.getValueAt(baris, 3).toString();
    String kolom5 = jTable1.getValueAt(baris, 4).toString();
    String kolom6 = jTable1.getValueAt(baris, 5).toString();

    nipAwal = kolom1;
        txtNip.setText(kolom1);
        txtNamaPegawai.setText(kolom2);
        txtGajiPokok.setText(kolom3);
        if(kolom4.equals("1")){
            CbGolongan.setSelectedIndex(0);
        }else if(kolom4.equals("2")){
            CbGolongan.setSelectedIndex(1);
        }else if(kolom4.equals("3")){
            CbGolongan.setSelectedIndex(2);
        }else if(kolom4.equals("4")){
            CbGolongan.setSelectedIndex(3);
        }else if(kolom4.equals("5")){
            CbGolongan.setSelectedIndex(4);
        }
        
        txtJamKerja.setText(kolom5);
        txtLembur.setText(kolom6);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DataPegawai().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbGolongan;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGajiPokok;
    private javax.swing.JTextField txtJamKerja;
    private javax.swing.JTextField txtLembur;
    private javax.swing.JTextField txtNamaPegawai;
    private javax.swing.JTextField txtNip;
    // End of variables declaration//GEN-END:variables

    private void ambil_data(List all) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
