package сontroller;

import model.SessionUser;
import model.User;
import service.UserService;

public class UserController {
    UserService userService = new UserService();

    public User registerUser(User user) throws Exception {
        return userService.registerUser(user);
    }

    public void logIn(User user) throws Exception {
        if (SessionUser.getLoggedInUser() != null)
            throw new Exception("User" + SessionUser.getLoggedInUser() + "is still logged in system.");
        userService.logIn(user);
    }

    public void logOut(User user) throws Exception {
        if (!user.equals(SessionUser.getLoggedInUser()))
            throw new Exception("User " + user + " you need to log in.");
        userService.logOut(user);
    }
}
