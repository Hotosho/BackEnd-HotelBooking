package service;

import dao.OrderDAO;
import dao.RoomDAO;
import dao.UserDAO;
import interfaces.OrderInterface;
import interfaces.UserInterface;
import model.Order;
import model.Room;
import model.User;

import java.time.LocalDate;
import java.util.List;

public class OrderService {
    OrderInterface orderInterface = new OrderDAO();


    public Order bookRoom(Order order) throws Exception {
        return orderInterface.addOrder(order);
    }

    public void addTestOrder(long roomId, long userId, LocalDate from, LocalDate to) throws Exception {
        Room room = new RoomDAO().findRoomById(roomId);
        User user = new UserDAO().findUserById(userId);
        orderInterface.addOrder(new Order(user, room, from, to, 9999));
    }

    public void cancelReservation(long roomId, long userId) throws Exception {
        OrderDAO orderDAO = new OrderDAO();
        List<Order> orderList = orderDAO.readToFile();
        for (Order ord : orderList) {
            if (ord.getRoom().getId() == roomId && ord.getUser().getId() == userId) {
                orderInterface.deleteOrder(ord);
            }
        }
    }

    public void deleteOrder(Order order, long orderId) throws Exception {
        OrderDAO orderDAO = new OrderDAO();
        List<Order> orderList = orderDAO.readToFile();
        for (Order ord : orderList) {
            if (ord.getId() == orderId) {
                orderInterface.deleteOrder(ord);
            }
        }

    }
}
