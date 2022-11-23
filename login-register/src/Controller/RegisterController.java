package Controller;

import Model.User;

import java.util.ArrayList;

public class RegisterController {
    public User createNewUser(String name, String username, String password, String phone, String address) {
        return new User(name, username, password, phone, address);
    }
}