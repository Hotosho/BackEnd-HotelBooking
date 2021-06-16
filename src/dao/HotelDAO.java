package dao;

import dataBase.Path;
import interfaces.HotelInterface;
import model.Hotel;

import java.util.List;
import java.util.Random;


public class HotelDAO extends MainDAO<Hotel> implements HotelInterface {
    Path path = new Path();

    @Override
    public String getPathToDB() {
        return path.hotelDB;
    }

    @Override
    public Hotel addHotel(Hotel hotel) throws Exception {
        Random random = new Random();
        hotel.setId(random.nextInt());
        if (hotel.getId() < 0) {
            hotel.setId(-1 * hotel.getId());
        }

        return addObject(hotel);
    }

    @Override
    public Hotel parseToRead(String line) throws Exception {
        String[] arr = line.split(",");
        return new Hotel(Long.parseLong(arr[0]), arr[1], arr[2], arr[3], arr[4]);
    }

    @Override
    public List<Hotel> getHotels() throws Exception {
        return super.readToFile();
    }

    @Override
    public Hotel deleteHotel(Hotel hotel) throws Exception {
        //return deleteObjects(hotel);
        return deleteEntity(hotel);

    }

    public Hotel findHotelById(long id) throws Exception {
        List<Hotel> hotelList = readToFile();
        for (Hotel hotel : hotelList) {
            if (hotel.getId() == id)
                return hotel;
        }
        throw new Exception("WTF WHY??? findHotelByID");
    }
}
