package demo;

import dao.HotelDAO;
import model.Hotel;
import сontroller.HotelController;
import сontroller.UserController;

public class HotelDemo {
    static Hotel staticHotel = new Hotel(999999L, "staticHotel", "Country", "City", "Street");

    public static void main(String[] args) throws Exception {
        HotelController hotelController = new HotelController();
        UserController userController = new UserController();
        userController.logIn(UserDemo.staticUser);
        //hotelController.addHotel(UserDemo.staticUser,staticHotel);

        Hotel hotel1 = new Hotel(1L, "Ajax", "Holland", "Amsterdam", "Amsterdamskaja");
        Hotel hotel2 = new Hotel(2L, "Slask", "Poland", "Wroclaw", "Wroclawskaja");
        Hotel hotel3 = new Hotel(3L, "Dynamo", "Ukraine", "Kyiv", "Obolonskaja");

        //good work
        //hotelController.addHotel(UserDemo.staticUser, hotel1);
        //hotelController.addHotel(UserDemo.staticUser,hotel2);
        //hotelController.addHotel(UserDemo.staticUser,hotel3);


        //good work
        //System.out.println(hotelController.findHotelByName("Slask"));

        //good work
        //System.out.println(hotelController.findHotelByCity("Kyiv"));

        //good work
        //hotelController.deleteHotel(hotel2);

        //good work
        //HotelDAO hotelDAO = new HotelDAO();
        //System.out.println(hotelDAO.findHotelById(108591326));
    }
}
