/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 18 Juni 2020
    Waktu	: 23.30 WITA
*/
package Source;

import java.util.Objects;

public class Pegawai {
    String nip; 
    String nama_pegawai; 
    String gaji_pokok;
    String golongan;
    String jam_kerja;
    String lembur;
    
    public Pegawai() { }
        public Pegawai(String nip, String nama_pegawai, String gaji_pokok, String golongan, String jam_kerja, String lembur) {
        this.nip = nip;
        this.nama_pegawai = nama_pegawai; 
        this.gaji_pokok = gaji_pokok;
        this.golongan = golongan;
        this.jam_kerja = jam_kerja;
        this.lembur = lembur;
        }
    public String getNip() { 
        return nip; 
    }
    public void setNip(String nip) { 
        this.nip = nip; 
    }
    
    public String getNama_Pegawai() { 
        return nama_pegawai; 
    }
    public void setNama_Pegawai(String nama_pegawai) { 
        this.nama_pegawai = nama_pegawai; 
    }
    
    public String getGaji_Pokok() { 
        return gaji_pokok; 
    } 
    public void setGaji_Pokok(String gaji_pokok) { 
        this.gaji_pokok = gaji_pokok; 
    }
    
     public String getGolongan() { 
        return golongan; 
    } 
    public void setGolongan(String golongan) { 
        this.golongan = golongan; 
    }
    
     public String getJam_Kerja() { 
        return jam_kerja; 
    } 
    public void setJam_Kerja(String jam_kerja) { 
        this.jam_kerja = jam_kerja; 
    }
    
     public String getLembur() { 
        return lembur; 
    } 
    public void setLembur(String lembur) { 
        this.lembur = lembur; 
    }
    
    @Override 
    public String toString() { 
        return "Pegawai{" + "nip=" + nip + ", nama_pegawai=" + nama_pegawai + ", gaji_pokok=" + gaji_pokok + ", golongan=" + golongan + ", jam_kerja=" + jam_kerja + ", lembur=" + lembur +'}'; 
    } 
    @Override 
    public int hashCode() { 
        int hash = 3; 
        hash = 89 * hash + Objects.hashCode(this.nip); 
        hash = 89 * hash + Objects.hashCode(this.nama_pegawai);
        hash = 89 * hash + Objects.hashCode(this.gaji_pokok);
        hash = 89 * hash + Objects.hashCode(this.golongan);
        hash = 89 * hash + Objects.hashCode(this.jam_kerja);
        hash = 89 * hash + Objects.hashCode(this.lembur);
        return hash; 
    } 
    @Override 
    public boolean equals(Object obj) { 
        if (this == obj) { 
            return true; 
        } 
        if (obj == null) { 
            return false; 
        } 
        if (getClass() != obj.getClass()) { 
            return false; 
        } 
        final Pegawai other = (Pegawai) obj; 
        if(!Objects.equals(this.nip, other.nip)) { 
            return false; 
        } if (!Objects.equals(this.nama_pegawai, other.nama_pegawai)) { 
            return false; 
        } if (!Objects.equals(this.gaji_pokok, other.gaji_pokok)) { 
            return false; 
        } if (!Objects.equals(this.golongan, other.golongan)) { 
            return false; 
        } if (!Objects.equals(this.jam_kerja, other.jam_kerja)) { 
            return false; 
        } if (!Objects.equals(this.lembur, other.lembur)) { 
            return false; 
        } 
        return true; 
    }
}
