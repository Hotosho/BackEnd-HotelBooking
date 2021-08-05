package service;

import dao.RoomDAO;
import interfaces.RoomInterface;
import model.Filtr;
import model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    RoomInterface roomInterface = new RoomDAO();

    public Room addRoom(Room room) throws Exception {
        return roomInterface.addRoom(room);
    }

    public Room deleteRoom(Room room) throws Exception {
        return roomInterface.deleteRoom(room);
    }

    public List<Room> foundRooms(Filtr filtr) throws Exception {
        ArrayList<Room> roomList = new ArrayList<>();
        for (Room rm : roomInterface.getRooms()) {
            if (filtr.filtrRooms(rm)) {
                roomList.add(rm);
            }
        }
        return roomList;
    }
}
