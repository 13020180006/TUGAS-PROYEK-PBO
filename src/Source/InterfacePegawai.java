/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 18 Juni 2020
    Waktu	: 23.53 WITA
*/
package Source;

import java.sql.SQLException;
import java.util.List;

public interface InterfacePegawai {
    Pegawai insert(Pegawai o) throws SQLException;
    void update(Pegawai o, String nipAwal) throws SQLException;
    void delete(String nip) throws SQLException;
    List getAll() throws SQLException;
}
