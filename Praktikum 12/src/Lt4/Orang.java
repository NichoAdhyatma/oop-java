package Lt4;

public class Orang {
    protected String nama;
    protected int umur;

    public Orang(String nama) {
        this.nama = nama;
    }

    public Orang(String nama, int umur) {
        this(nama);
        this.umur = umur;
    }
}