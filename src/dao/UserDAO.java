package dao;

import dataBase.Path;
import interfaces.UserInterface;
import model.User;
import model.UserType;

import java.util.List;
import java.util.Random;

public class UserDAO extends MainDAO<User> implements UserInterface {
    Path path = new Path();

    @Override
    public String getPathToDB() {
        return path.userDB;
    }

    @Override
    public User addUser(User user) throws Exception {
        Random random = new Random();
        user.setId(random.nextInt());
        if (user.getId() < 0) {
            user.setId(-1 * user.getId());
        }
        return addObject(user);
    }

    @Override
    public User parseToRead(String line) throws Exception {
        String[] arr = line.split(",");
        return new User(Long.parseLong(arr[0]), arr[1], arr[2], arr[3], UserType.valueOf(arr[4]));
    }

    @Override
    public List<User> getUsers() throws Exception {
        return readToFile();
    }
}
