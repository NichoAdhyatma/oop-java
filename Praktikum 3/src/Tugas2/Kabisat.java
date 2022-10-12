package Tugas2;

public class Kabisat {
    private final int tahun;

    public Kabisat(int initYear) {
        tahun = initYear;
        if (cekTahun()) {
            if (cekKabisat()) System.out.print("tahun " + tahun + " adalah tahun kabisat");
            else System.out.print("tahun " + tahun + " bukan tahun kabisat");
        }
    }

    public boolean cekTahun() {
        if (tahun < 1900) {
            System.out.println("maaf , tahun " + tahun + " dibawah 1900");
            return false;
        } else if (tahun > 2005) {
            System.out.println("maaf, tahun " + tahun + " di atas 2005");
            return false;
        }
        return true;
    }

    public boolean cekKabisat() {
        if (tahun % 100 != 0 && tahun % 4 == 0) return true;
        else return tahun % 400 == 0;
    }
}