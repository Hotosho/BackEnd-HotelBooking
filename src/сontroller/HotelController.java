package сontroller;

import model.Hotel;
import model.SessionUser;
import model.User;
import model.UserType;
import service.HotelService;

public class HotelController {
    //admin logic
    HotelService hotelService = new HotelService();

    public Hotel addHotel(User user, Hotel hotel) throws Exception {
        if (!user.equals(SessionUser.getLoggedInUser()))
            throw new Exception("User " + user + " you need to log in.");
        if (user.getUserType() != UserType.ADMIN)
            throw new Exception("User " + user + " you must have administrator rights.");
        return hotelService.addHotel(hotel);
    }

    public Hotel findHotelByName(String name) throws Exception {
        return hotelService.findHotelByName(name);
    }

    public Hotel findHotelByCity(String city) throws Exception {
        return hotelService.findHotelByCity(city);
    }

    public Hotel deleteHotel(Hotel hotel) throws Exception{
        return hotelService.deleteHotel(hotel);
    }
}
