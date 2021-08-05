package dao;

import dataBase.Path;
import interfaces.OrderInterface;
import model.Order;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class OrderDAO extends MainDAO<Order> implements OrderInterface {
    Path path = new Path();

    @Override
    public String getPathToDB() {
        return path.orderDB;
    }

    @Override
    public Order addOrder(Order order) throws Exception {
        Random random = new Random();
        order.setId(random.nextInt());
        if (order.getId() < 0) {
            order.setId(-1 * order.getId());
        }
        return addObject(order);
    }

    @Override
    public List<Order> readToFile() throws Exception {
        return super.readToFile();
    }


    @Override
    public Order parseToRead(String line) throws Exception {
        String[] arr = line.split(",");
        return new Order(Long.parseLong(arr[0]), new UserDAO().findUserById(Long.parseLong(arr[1])), new RoomDAO().findRoomById(Long.parseLong(arr[2])),
                LocalDate.parse(arr[3]), LocalDate.parse(arr[4]), Double.parseDouble(arr[5]));
    }

    @Override
    public Order deleteOrder(Order order) throws Exception {
        return deleteEntity(order);
    }


}
