package perbankan;

public class PenyimpananUang extends Tabungan {
    private double tingkatBunga;

    public PenyimpananUang(int saldo, double tingkatBunga) {
        super.saldo = saldo;
        this.tingkatBunga = tingkatBunga;
    }

    public double cekUang() {
        return saldo + (saldo * tingkatBunga);
    }

}