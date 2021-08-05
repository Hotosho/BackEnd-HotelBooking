package interfaces;

import model.Order;
import model.User;

import java.time.LocalDate;

public interface OrderInterface {

    Order addOrder(Order order) throws Exception;

    Order deleteOrder(Order order) throws Exception;
}
