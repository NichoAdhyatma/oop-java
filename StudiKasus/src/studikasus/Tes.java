package studikasus;


public class Tes {
    public static void main(String[] args) {

// Dosen
        System.out.println("=== Instance Dosen Jabatan Ketua Prodi=== ");

        Dosen Budi = new Dosen();
        Budi.nama = "Budi";
        Budi.id = "11921";
        Budi.meneliti();
        Budi.menerimaJabatan(new KetuaProdi());
        System.out.print(Budi.nama + ": ");
        Budi.jabatan.menjalankanJabatan();

        System.out.println("=== Instance Dosen Jabatan Kepala Bagian === ");
        Dosen Anwar = new Dosen();
        Anwar.nama = "Anwar";
        Anwar.id = "12711";
        Anwar.meneliti();
        Anwar.menerimaJabatan(new KepalaBagian());
        System.out.print(Anwar.nama + ": ");
        Anwar.jabatan.menjalankanJabatan();
        System.out.println("=== Instance Karyawan Jabatan Kepala Bagian === ");
// Karyawan
        Karyawan Hilmi = new Karyawan();
        Hilmi.nama = "Hilmi";
        Hilmi.id = "912183";
        Hilmi.bekerja();
        Hilmi.menerimaJabatan(new KepalaBagian());
        System.out.print(Hilmi.nama + ": ");
        Hilmi.jabatan.menjalankanJabatan();
// Mahasiswa
        System.out.println("=== Instance Mahasiswa dan Dosen Walinya=== ");
        Mahasiswa Nicho = new Mahasiswa();
        Nicho.nama = "Nicho";
        Nicho.id = "3121600049";
        Nicho.belajar();
        Nicho.setDosenWali(Anwar);
        System.out.print(Nicho.dosenWali.nama + " Adalah Dosen Wali dari Mahasiswa " + Nicho.nama);
    }
}
