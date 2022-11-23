package Project.Modul;

import Project.Base.*;
import Project.Data.Model.User;
import Project.Data.Source.SessionRepository;

public class LoginPresenter implements BasePresenter {
    public SessionRepository<User> sessionRepository;
    public BaseView view;

    public LoginPresenter(BaseView view, SessionRepository<User> sessionRepository) {
        this.sessionRepository = sessionRepository;
        this.view = view;
    }
}