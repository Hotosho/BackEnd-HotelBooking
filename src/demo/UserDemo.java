package demo;

import dao.UserDAO;
import model.User;
import model.UserType;
import сontroller.UserController;

public class UserDemo {
    static User staticUser = new User(111L, "staticUser", "12345", "Spain", UserType.ADMIN);

    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();

        User user1 = new User(1L, "admin", "qwert", "USA", UserType.ADMIN);
        User user2 = new User(2L, "userName_2", "asdfg", "Poland", UserType.USER);
        User user3 = new User(3L, "userName_3", "zxcvb", "Ukraine", UserType.USER);

        //good work
        //userController.registerUser(staticUser);

        //good work
        //userController.registerUser(user1);
        //userController.registerUser(user2);
        //userController.registerUser(user3);




    }
}
