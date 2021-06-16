package service;

import dao.HotelDAO;
import interfaces.HotelInterface;
import model.Hotel;

import java.util.List;

public class HotelService {
    //business logic
    HotelInterface hotelInterface = new HotelDAO();

    public Hotel addHotel(Hotel hotel) throws Exception {
        return hotelInterface.addHotel(hotel);
    }

    public Hotel deleteHotel(Hotel hotel) throws Exception{
        return hotelInterface.deleteHotel(hotel);
    }

    public Hotel findHotelByName(String name) throws Exception {
        List<Hotel> hotelList = hotelInterface.getHotels();
        for (Hotel hotel : hotelList) {
            if (hotel.getName().equals(name))
                return hotel;
        }
        throw new Exception("Hotel with such name " + name + " does not exist.");
    }

    public Hotel findHotelByCity(String city) throws Exception {
        List<Hotel> hotelList = hotelInterface.getHotels();
        for (Hotel hotel : hotelList) {
            if (hotel.getCity().equals(city))
                return hotel;
        }
        throw new Exception("Hotel with such name " + city + " does not exist");
    }
}
