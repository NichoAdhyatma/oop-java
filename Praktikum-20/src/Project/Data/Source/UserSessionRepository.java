package Project.Data.Source;

import Project.Data.Model.User;

public class UserSessionRepository implements SessionRepository<User> {
    User user;

    @Override
    public void setSession(User user) {

    }

    @Override
    public User getSession() {
        return user;
    }

    @Override
    public void destroySession() {

    }

    @Override
    public void updateSession() {

    }
}