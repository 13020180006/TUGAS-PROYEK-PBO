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
import javax.swing.table.DefaultTableModel;

public class DataPegawai2 extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    InterfacePegawai interfacePegawai;
    List record = new ArrayList();
    int baris;
    
    public DataPegawai2() {
        initComponents();
        KoneksiDB.getConnection();
        interfacePegawai = new ImplementPegawai();
        Kembali1.setEnabled(true);
        
        ambil_data();
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
            jTable2.setModel(new DefaultTableModel(data, judul));
            jScrollPane2.setViewportView(jTable2);
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

        Kembali1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kembali1.setFont(new java.awt.Font("Apricity", 0, 18)); // NOI18N
        Kembali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-back-64.png"))); // NOI18N
        Kembali1.setText("KEMBALI");
        Kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kembali1ActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, 60));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 720, 149));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void Kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kembali1ActionPerformed
        // TODO add your handling code here:
        HitungGajiPegawai m = new HitungGajiPegawai();
        m.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_Kembali1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataPegawai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPegawai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPegawai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPegawai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPegawai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
