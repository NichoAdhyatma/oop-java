package Model;

public class User {
    public String name;
    public String username;
    public String password;
    public String phone;
    public String address;

    public User(String name, String username, String password, String phone, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }
}