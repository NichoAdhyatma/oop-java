package View;

import Controller.RegisterController;

import java.util.Scanner;

public class RegisterView {
    RegisterController register;
    Scanner input = new Scanner(System.in);

    public String address;

    public void showForm() {
        String username;
        String name;
        String password;
        String phone;
        System.out.println("Form Register");
        System.out.print("Nama : ");
        name = input.nextLine();
        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        System.out.print("Phone : ");
        phone = input.nextLine();
        System.out.print("Phone : ");
        phone = input.nextLine();


    }
}