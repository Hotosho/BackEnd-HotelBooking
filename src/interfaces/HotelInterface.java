package interfaces;

import model.Hotel;

import java.util.List;

public interface HotelInterface {

    Hotel addHotel(Hotel hotel) throws Exception;

    List<Hotel> getHotels() throws Exception;

    Hotel deleteHotel(Hotel hotel) throws Exception;
}
