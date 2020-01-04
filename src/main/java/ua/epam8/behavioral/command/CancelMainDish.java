package ua.epam8.behavioral.command;

public class CancelMainDish implements Command {
    private MainDish item;

    public CancelMainDish(MainDish i) {
        item = i;
    }

    public void execute() {
        item.cancel();
    }
}
