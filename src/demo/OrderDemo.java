package demo;


import dao.HotelDAO;
import dao.OrderDAO;
import dao.RoomDAO;
import dao.UserDAO;
import model.Order;
import service.OrderService;
import сontroller.OrderController;
import сontroller.UserController;

import java.time.LocalDate;

public class OrderDemo {
    public static void main(String[] args) throws Exception {
        UserDAO userDAO = new UserDAO();
        RoomDAO roomDAO = new RoomDAO();
        OrderController orderController = new OrderController();
        UserController userController = new UserController();
        userController.logIn(UserDemo.staticUser);

        Order order1 = new Order(1L, userDAO.findUserById(899372913), roomDAO.findRoomById(182293361), LocalDate.parse("2021-09-01"), LocalDate.parse("2021-09-09"), 123);
        Order order2 = new Order(2L, userDAO.findUserById(1681985585), roomDAO.findRoomById(657732147), LocalDate.parse("2021-10-01"), LocalDate.parse("2021-10-10"), 999);

        //good work
        orderController.bookRoom(UserDemo.staticUser,order1);
        //orderController.bookRoom(UserDemo.staticUser, order2);
        //orderController.deleteOrder(order1, 1884073026);


        // good work (second method)
        //orderController.addTestOrder(657732147, 1681985585, LocalDate.parse("2021-10-01"), LocalDate.parse("2021-10-10"));
        //orderController.cancelReservation(182293361, 899372913);


    }
}
