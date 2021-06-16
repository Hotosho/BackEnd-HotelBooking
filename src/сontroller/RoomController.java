package сontroller;

import model.Room;
import model.SessionUser;
import model.User;
import model.UserType;
import service.RoomService;

public class RoomController {
    RoomService roomService = new RoomService();

    public Room addRoom(User user, Room room) throws Exception {
        if (!user.equals(SessionUser.getLoggedInUser()))
            throw new Exception("User " + user + " you need to log in.");
        if (user.getUserType() != UserType.ADMIN)
            throw new Exception("User " + user + " you must have administrator rights.");
        return roomService.addRoom(room);
    }

    public Room deleteRoom(User user, Room room) throws Exception {
        if (!user.equals(SessionUser.getLoggedInUser()))
            throw new Exception("User " + user + " you need to log in.");
        if (user.getUserType() != UserType.ADMIN)
            throw new Exception("User " + user + " you must have administrator rights.");
        return roomService.deleteRoom(room);
    }
}
