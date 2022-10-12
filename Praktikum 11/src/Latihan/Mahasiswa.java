package Latihan;

class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    Mahasiswa() {
       this("", "", "");
    }

    Mahasiswa(String username, String password, String phone) {
        super(username, password, phone);
    }

}