package ua.epam8.behavioral.command;

public class CancelDessert implements Command {
    private Dessert coupon;

    public CancelDessert(Dessert c) {
        coupon = c;
    }

    public void execute() {
        coupon.cancel();
    }
}
