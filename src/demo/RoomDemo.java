package demo;

import model.Filtr;

import model.Room;
import service.RoomService;
import сontroller.HotelController;
import сontroller.RoomController;
import сontroller.UserController;

import java.time.LocalDate;

public class RoomDemo {
    static Room staticRoom = new Room(88888L, 8, 8000.0, true, true, LocalDate.now(), HotelDemo.staticHotel);

    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        userController.logIn(UserDemo.staticUser);
        RoomController roomController = new RoomController();
        HotelController hotelController = new HotelController();


        Room room1 = new Room(1L, 2, 300.0, true, false, LocalDate.now(), hotelController.findHotelByName("Ajax"));
        Room room2 = new Room(2L, 4, 500.0, true, true, LocalDate.now(), hotelController.findHotelByName("Slask"));
        Room room3 = new Room(3L, 1, 100.0, false, false, LocalDate.now(), hotelController.findHotelByName("Dynamo"));
        //Hotel hotelTest = new Hotel(999999, "testName", "testCountry", "testCity", "testStreet");
        //Room roomTest = new Room(4L, 4, 9009,true,true,LocalDate.now(), hotelController.findHotelByName("Dynamo"));

        //good work
        //roomController.addRoom(UserDemo.staticUser, room1);
        //roomController.addRoom(UserDemo.staticUser,room2);
        //roomController.addRoom(UserDemo.staticUser,room3);

        //good work
        //roomController.deleteRoom(UserDemo.staticUser, room1);

        //Filtr filtr1 = new Filtr("Name", "country", "city", "street", 4, 400.0,
        //false, false, LocalDate.parse("2021-09-01"));

        //Filtr filtr2 = new Filtr("Irma", "UK", "London", "DownSteet", 1, 1000.0,
        //true,false, LocalDate.parse("2021-10-01"));

        Filtr filtr = new Filtr();
        filtr.setPrice(500.0);
        filtr.setNumberOfGuests(3);

        RoomService roomService = new RoomService();
        roomService.foundRooms(filtr);
        System.out.println(roomService.foundRooms(filtr));

    }
}
