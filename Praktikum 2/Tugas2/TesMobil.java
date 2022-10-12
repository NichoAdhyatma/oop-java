public class TesMobil {
  public static void main(String srt[]) {
    Mobil mobil1, mobil2,mobil3, mobil4;
    mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
    mobil2 = new Mobil("Daihatsu", "Hitam", "pick up", 1500, 2);
    mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
    mobil4 = new Mobil("Honda", "Merah", "Sedan", 1300, 5);

    mobil1.infoMobil();
    mobil2.infoMobil();
    mobil3.infoMobil();
    mobil4.infoMobil();
  }
}