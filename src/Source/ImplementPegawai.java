/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 18 Juni 2020
    Waktu	: 23.49 WITA
*/
package Source;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplementPegawai implements InterfacePegawai{
    @Override
    public Pegawai insert(Pegawai o) throws SQLException {
        PreparedStatement st = KoneksiDB.getConnection().prepareStatement("insert into pegawai values(?,?,?,?,?,?)");
        st.setString(1, o.getNip());
        st.setString(2, o.getNama_Pegawai());
        st.setString(3, o.getGaji_Pokok());
        st.setString(4, o.getGolongan());
        st.setString(5, o.getJam_Kerja());
        st.setString(6, o.getLembur());
        st.executeUpdate();
        return o;
    }
    @Override
    public void update(Pegawai o, String nipAwal) throws SQLException {
        PreparedStatement st = KoneksiDB.getConnection().prepareStatement("update pegawai set nama_pegawai='"+o.getNama_Pegawai()+"',gaji_pokok='"+o.getGaji_Pokok()+
                "', nip='"+o.getNip()+"',golongan='"+o.getGolongan()+"', jam_kerja='"+o.getJam_Kerja()+"', lembur='"+o.getLembur()+"' where nip='"+nipAwal+"'");
        st.executeUpdate();
    }
    @Override
    public void delete(String nip) throws SQLException {
        PreparedStatement st = KoneksiDB.getConnection().prepareStatement("delete from pegawai where nip=?");
        st.setString(1, nip);
        st.executeUpdate();
    }
    @Override
    public List getAll() throws SQLException {
        Statement st = KoneksiDB.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from pegawai");
        List list = new ArrayList();
        while (rs.next()) {
            Pegawai p = new Pegawai();
            p.setNip(rs.getString("Nip"));
            p.setNama_Pegawai(rs.getString("Nama_Pegawai"));
            p.setGaji_Pokok(rs.getString("Gaji_Pokok"));
            p.setGolongan(rs.getString("Golongan"));
            p.setJam_Kerja(rs.getString("Jam_Kerja"));
            p.setLembur(rs.getString("Lembur"));
            list.add(p);
        }
        return list;
    }
    public List getSearch(String code) throws SQLException {
        Statement st = KoneksiDB.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from pegawai where nama_pegawai LIKE '"+code+"%'");
        List list = new ArrayList();
        while (rs.next()) {
            Pegawai p = new Pegawai();
            p.setNip(rs.getString("nip"));
            p.setNama_Pegawai(rs.getString("nama_pegawai"));
            p.setGaji_Pokok(rs.getString("gaji_pokok"));
            p.setGolongan(rs.getString("golongan"));
            p.setJam_Kerja(rs.getString("jam_kerja"));
            p.setLembur(rs.getString("lembur"));
            
            list.add(p);
        }
        return list;
    }
}
