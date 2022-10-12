public class Mobil {

  public int cc, unit;
  public String merk, warna, tipe;

  public Mobil(String A, String B, String C, int D, int E) {
    merk = A;
    warna = B;
    tipe = C;
    cc = D;
    unit = E;
  }

  public void infoMobil() {
    System.out.println("Merk : " + merk + " | Warna : " + warna + " | tipe : " + tipe + " | CC : " + cc + " | Unit : " + unit);
  }
}
