package Latihan;

import java.util.Objects;

class User {
    private String id;
    private String phone;
    private String username;
    private String password;

    User() {
        this("", "");
    }

    User(String username, String password) {
        this(username, password, "");
    }

    User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public boolean login(String username, String password) {
        return Objects.equals(this.username, username) && Objects.equals(this.password, password);
    }

}