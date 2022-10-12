import sekolah.*;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa( 1, "tes");
        Kelas kls = new Kelas(2, "kls 1");

        kls.setMhs(mhs);
        System.out.println("Kode kelas : " + kls.getKodekelas() + "\nNama kelas : " + kls.getNamakelas() + "\nNrp " + kls.mahasiswa.getNrp());
    }
}