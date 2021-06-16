package demo;

import model.Room;
import сontroller.RoomController;
import сontroller.UserController;

import java.time.LocalDate;

public class RoomDemo {
    static Room staticRoom = new Room(88888L, 8, 8000.0, true, true,LocalDate.now(),HotelDemo.staticHotel);

    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        userController.logIn(UserDemo.staticUser);
        RoomController roomController = new RoomController();

        Room room1 = new Room(1L, 2, 300.0, true, false, LocalDate.now(), HotelDemo.staticHotel);
        Room room2 = new Room(2L, 4, 500.0, true, true, LocalDate.now(), HotelDemo.staticHotel);
        Room room3 = new Room(3L, 1, 100.0, false, false, LocalDate.now(), HotelDemo.staticHotel);

        //good work
        //roomController.addRoom(UserDemo.staticUser, room1);
        //roomController.addRoom(UserDemo.staticUser,room2);
        //roomController.addRoom(UserDemo.staticUser,room3);

        //WTF((( dont work ((
        roomController.deleteRoom(UserDemo.staticUser,room2);
    }
}
