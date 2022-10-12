package tugas2;

public class Kecebong extends Katak {
    double panjangEkor;

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }

    public String caraBergerak() {
        return "berenang";
    }
}