package ua.epam8.behavioral.command;

public class OrderMainDish implements Command {
    private MainDish item;

    public OrderMainDish(MainDish i) {
        item = i;
    }

    public void execute() {
        item.order();
    }
}
