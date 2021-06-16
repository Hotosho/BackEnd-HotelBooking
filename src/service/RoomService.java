package service;

import dao.RoomDAO;
import interfaces.RoomInterface;
import model.Room;

public class RoomService {
    RoomInterface roomInterface = new RoomDAO();

    public Room addRoom(Room room) throws Exception {
        return roomInterface.addRoom(room);
    }

    public Room deleteRoom(Room room) throws Exception{
        return roomInterface.deleteRoom(room);
    }
}
