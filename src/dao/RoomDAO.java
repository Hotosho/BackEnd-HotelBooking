package dao;

import dataBase.Path;
import demo.HotelDemo;
import interfaces.RoomInterface;
import model.Room;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class RoomDAO extends MainDAO<Room> implements RoomInterface {
    Path path = new Path();


    @Override
    public String getPathToDB() {
        return path.roomDB;
    }

    @Override
    public Room addRoom(Room room) throws Exception {
        Random random = new Random();
        room.setId(random.nextInt());
        if (room.getId() < 0) {
            room.setId(-1 * room.getId());
        }
        return addObject(room);
    }

    @Override
    public Room parseToRead(String line) throws Exception {
        String[] arr = line.split(",");
        return new Room(Long.parseLong(arr[0]), Integer.parseInt(arr[1]), Double.parseDouble(arr[2]), Boolean.parseBoolean(arr[3]),
                Boolean.parseBoolean(arr[4]), LocalDate.parse(arr[5]), new HotelDAO().findHotelById(Long.parseLong(arr[6])));
    }

    @Override
    public List<Room> getRooms() throws Exception {
        return readToFile();
    }

    @Override
    public Room deleteRoom(Room room) throws Exception {
        return deleteEntity(room);
    }
}
