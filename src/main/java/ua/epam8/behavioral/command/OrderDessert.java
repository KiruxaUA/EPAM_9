package ua.epam8.behavioral.command;

public class OrderDessert implements Command {
    private Dessert coupon;

    public OrderDessert(Dessert c) {
        coupon = c;
    }

    public void execute() {
        coupon.order();
    }
}
