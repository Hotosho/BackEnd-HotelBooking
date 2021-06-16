package interfaces;

import model.Room;

import java.util.List;

public interface RoomInterface {

    Room addRoom(Room room) throws Exception;

    List<Room> getRooms() throws Exception;

    Room deleteRoom(Room room) throws Exception;
}
