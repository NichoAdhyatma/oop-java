package studikasus;

public class Dosen extends Pegawai {
    public void mengabdi() {
        System.out.println("Dosen " + super.nama + " Sedang Mengabdi");
    }

    public void mengajar() {
        System.out.println("Dosen " + super.nama + " Sedang Mengajar");
    }

    public void meneliti() {
        System.out.println("Dosen " + super.nama + " Sedang Meneliti");
    }

    @Override
    public void menerimaJabatan(Jabatan jabatan) {
        super.jabatan = jabatan;
    }
}