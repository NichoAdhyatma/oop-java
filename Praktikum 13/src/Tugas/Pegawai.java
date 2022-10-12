package Tugas;

public class Pegawai {
    protected String nama;
    protected int gaji;

    Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {
        return gaji;
    }
}