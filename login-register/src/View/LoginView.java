package View;

import Controller.LoginController;

public class LoginView {
    LoginController login;
    RegisterView registerView;

    public LoginView() {
        //sudah register
        //jika belum panggil method register
    }

    public void Register() {

    }

    public void MainView() {

    }

    public void Auth() {
        if(login.auth("tes", "123")){
            //generateSession
            MainView();
        }
        else {
            System.out.println("Data not Match");
        }
    }
}