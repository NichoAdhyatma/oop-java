package perbankan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if(saldo - jumlah > 0 ) {
            saldo -= jumlah;
            return true;
        }
        return  false;
    }
}