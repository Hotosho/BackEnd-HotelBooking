package сontroller;

import dao.UserDAO;
import model.Order;
import model.Room;
import model.SessionUser;
import model.User;
import service.OrderService;

import java.time.LocalDate;

public class OrderController {
    OrderService orderService = new OrderService();
    UserDAO userDAO = new UserDAO();

    public Order bookRoom(User user, Order order) throws Exception {
        if (!user.equals(SessionUser.getLoggedInUser())) {
            throw new Exception("User " + user + " you need to log in.");
        }
        return orderService.bookRoom(order);
    }

    public void addTestOrder(long roomId, long userId, LocalDate from, LocalDate to) throws Exception {
        orderService.addTestOrder(roomId, userId, from, to);
    }

    public void cancelReservation(long roomId, long userId) throws Exception{
        orderService.cancelReservation(roomId, userId);
    }

    public void deleteOrder(Order order, long orderId) throws Exception{
        orderService.deleteOrder(order, orderId);
    }
}
