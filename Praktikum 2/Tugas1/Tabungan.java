public class Tabungan {

  int saldo;

  public Tabungan(int initSaldo) {
    saldo = initSaldo;
  }

  public int getSaldo() {
    return saldo;
  }

  public void simpanUang(int jumlah) {
    saldo += jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if (saldo - jumlah > 0) {
      saldo -= jumlah;
      return true;
    }
    return false;
  }
}
