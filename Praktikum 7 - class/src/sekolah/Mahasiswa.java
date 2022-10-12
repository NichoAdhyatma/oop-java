package sekolah;

public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa(int nrp, String nama) {
        this.nrp=nrp;
        this.nama=nama;
    }

    public String getNama() {
        return nama;
    }

    public int getNrp() {
        return nrp;
    }
}