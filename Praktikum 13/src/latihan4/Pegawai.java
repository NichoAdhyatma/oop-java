package latihan4;

public class Pegawai {
    private String nama;
    private int gaji;

    public Pegawai(String nama, int gaji) {
       this.nama = nama;
       this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }
}