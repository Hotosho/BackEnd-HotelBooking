package interfaces;

import model.User;

import java.util.List;

public interface UserInterface {

    User addUser(User user) throws Exception;

    List<User> getUsers() throws Exception;
}
