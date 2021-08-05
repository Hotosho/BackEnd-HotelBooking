package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order {
    private long id;
    private User user;
    private Room room;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double moneyPaid;


    public Order(long id, User user, Room room, LocalDate dateFrom, LocalDate dateTo, double moneyPaid) {
        this.id = id;
        this.user = user;
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.moneyPaid = moneyPaid;
    }

    public Order(User user, Room room, LocalDate dateFrom, LocalDate dateTo, double moneyPaid) {
        this.user = user;
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.moneyPaid = moneyPaid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public double getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(double moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(order.moneyPaid, moneyPaid) == 0 && Objects.equals(user, order.user) && Objects.equals(room, order.room) && Objects.equals(dateFrom, order.dateFrom) && Objects.equals(dateTo, order.dateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, room, dateFrom, dateTo, moneyPaid);
    }

    @Override
    public String toString() {
        return getId() + "," + user.getId() + "," + room.getId() + "," + dateFrom + "," + dateTo + "," + moneyPaid;
    }
}
