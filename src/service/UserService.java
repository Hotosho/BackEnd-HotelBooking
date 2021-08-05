package service;

import dao.UserDAO;
import interfaces.UserInterface;
import model.SessionUser;
import model.User;


public class UserService {
    UserInterface userInterface = new UserDAO();

    public User registerUser(User user) throws Exception {
        return userInterface.addUser(user);
    }

    public void logIn(User user) throws Exception {
        SessionUser.setLoggedInUser(user);
    }

    public void logOut(User user) throws Exception {
        SessionUser.setLoggedInUser(null);
    }
}
