package perbankan;

public class PengambilanUang extends Tabungan {
    private int proteksi;

    public PengambilanUang(int saldo) {
        this(saldo, 0);
    }

    public PengambilanUang(int saldo, int tingkatBunga) {
        super.saldo = saldo;
        proteksi = tingkatBunga;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo - proteksi > jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
}