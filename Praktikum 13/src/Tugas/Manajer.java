package Tugas;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }


    public int infoGaji() {
        return super.infoGaji();
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}