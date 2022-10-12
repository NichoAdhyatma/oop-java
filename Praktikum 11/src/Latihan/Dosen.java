package Latihan;

import java.util.Objects;

class Dosen extends User {
    private String pangkat;
    private String golongan;
    private String key;

    Dosen() {
        this("", "", "", "");
    }

    Dosen(String username, String password, String phone, String key) {
        super(username, password, phone);
        this.key = key;
    }

    public boolean login(String username, String password, String key) {
        return login(username, password) && Objects.equals(this.key, key);
    }
}