package studikasus;

public class Karyawan extends Pegawai {
    public void bekerja() {
        System.out.println("Karyawan " + super.nama + "Sedang Bekerja");
    }

    @Override
    public void menerimaJabatan(Jabatan jabatan) {
        if (jabatan instanceof KepalaBagian) {
            super.jabatan = jabatan;
        }
    }
}