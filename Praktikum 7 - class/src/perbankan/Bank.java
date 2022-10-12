package perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
        nasabah = new Nasabah[4];
        jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        this.nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        this.jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int index) {
        return nasabah[index];
    }
}