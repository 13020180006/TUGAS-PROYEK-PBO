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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class HitungGajiPegawai extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    InterfacePegawai interfacePegawai;
    List record = new ArrayList();
    int baris;
    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String namaPegawai;
    String gaji_pokok;
    String jam_kerja;
    String lembur;
    String nip;
    String golongan;
    
    public HitungGajiPegawai() {
        initComponents();
         
        conn=KoneksiDB.getConnection();
        interfacePegawai = new ImplementPegawai();
        ambil_data();
    }
    public void ambil_data() { 
        try {
            String sql="select * from pegawai";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String name = rs.getString("nip");
                CbNip.addItem(name);
            }
            
        } catch (Exception e){
            
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

        txtGajiPokok = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Lihat = new javax.swing.JButton();
        CbNip = new javax.swing.JComboBox<>();
        txtGolongan = new javax.swing.JTextField();
        iniGajiBersih = new javax.swing.JTextField();
        iniTotalGaji = new javax.swing.JTextField();
        iniNamaPegawai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Proyek PBO (Paramadina Mulya / 13020180006)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtGajiPokok, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 440, 40));

        Hitung.setFont(new java.awt.Font("Apricity", 0, 18)); // NOI18N
        Hitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-calculator-64.png"))); // NOI18N
        Hitung.setText("HITUNG");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 170, -1));

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-reset-24.png"))); // NOI18N
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 120, 40));

        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-go-back-26.png"))); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 120, 40));

        Lihat.setText("LIHAT DATA PEGAWAI");
        Lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatActionPerformed(evt);
            }
        });
        getContentPane().add(Lihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 170, -1));

        CbNip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih" }));
        CbNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbNipActionPerformed(evt);
            }
        });
        getContentPane().add(CbNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, 40));

        txtGolongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGolonganActionPerformed(evt);
            }
        });
        getContentPane().add(txtGolongan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 440, 40));
        getContentPane().add(iniGajiBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 450, 40));
        getContentPane().add(iniTotalGaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 450, 40));

        iniNamaPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniNamaPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(iniNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 450, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HITUNG GAJI.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        CbNip.setSelectedIndex(0);
        txtGajiPokok.setText("");
        txtGolongan.setText("");
        iniNamaPegawai.setText("");
        iniGajiBersih.setText("");
        iniTotalGaji.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_KembaliActionPerformed

    private void LihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatActionPerformed
        // TODO add your handling code here:
        DataPegawai2 dp = new DataPegawai2();
        dp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LihatActionPerformed

    private void CbNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbNipActionPerformed
        // TODO add your handling code here:
        //ambil_data();
        String tmp =  (String) CbNip.getSelectedItem();
        String sql="select * from pegawai where nip=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            if(rs.next()){
                nip = rs.getString("nip");
                namaPegawai = rs.getString("nama_pegawai");
                lembur = rs.getString("lembur");
                jam_kerja = rs.getString("jam_kerja");
                gaji_pokok = rs.getString("gaji_pokok");
                txtGajiPokok.setText(gaji_pokok);
                golongan = rs.getString("golongan");
                txtGolongan.setText(golongan);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_CbNipActionPerformed

    public void itungdata(){
        int lemburreal = Integer.parseInt(lembur);
        int gajipokokreal = Integer.parseInt(gaji_pokok);
        int golonganreal = Integer.parseInt(golongan);
         double tunjangan =  (gajipokokreal * 0.15);
         double pajak = (0.1 * (gajipokokreal + tunjangan));
         double gajiBersih = (gajipokokreal + tunjangan - pajak);
         int totalGaji = 0;
        if(golonganreal == 1){
             totalGaji = (500000 + (5000 * lemburreal));
        }else if(golonganreal == 2){
             totalGaji = (300000 + (3000 * lemburreal));
        }else if(golonganreal == 3){
             totalGaji = (250000 + (2000 * lemburreal));
        }else if(golonganreal == 4){
             totalGaji = (100000 + (1500 * lemburreal));
        }else if(golonganreal == 5){
             totalGaji = (50000 + (1000 * lemburreal));
        }
        
        iniNamaPegawai.setText(namaPegawai);
        iniGajiBersih.setText(String.valueOf(gajiBersih));
        iniTotalGaji.setText(String.valueOf(totalGaji));
    }
    
    private void txtGolonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGolonganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGolonganActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
         itungdata();
    }//GEN-LAST:event_HitungActionPerformed

    private void iniNamaPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniNamaPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniNamaPegawaiActionPerformed

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
            java.util.logging.Logger.getLogger(HitungGajiPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungGajiPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungGajiPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungGajiPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungGajiPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbNip;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Lihat;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField iniGajiBersih;
    private javax.swing.JTextField iniNamaPegawai;
    private javax.swing.JTextField iniTotalGaji;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtGajiPokok;
    private javax.swing.JTextField txtGolongan;
    // End of variables declaration//GEN-END:variables
}
