package studikasus;

public class Mahasiswa extends User {
    public Dosen dosenWali;

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void mengikutiPerkuliahan() {
        System.out.println("Mahasiswa Mengikuti Perkuliahan");
    }

    public void belajar() {
        System.out.println("Mahasiswa Belajar Mandiri");
    }

    public void mengerjakanTugas() {
        System.out.println("Mahasiswa Mengerjakan Tugas dari Dosen");
    }
}