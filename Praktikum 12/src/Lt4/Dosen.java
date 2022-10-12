package Lt4;

public class Dosen extends Orang{
    private int nip;

    public Dosen(String nama) {
        super(nama);
    }

    public Dosen(String nama, int nip) {
        this(nama);
        this.nip = nip;
    }

    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }

    public void Info() {
        System.out.println("Nama : " + super.nama);
        System.out.println("NIP : " + this.nip);
        System.out.println("Umur : " + super.umur);
    }
}