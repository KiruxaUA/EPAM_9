package ua.epam8.behavioral.command;

public class Waiter {
    public void execute(Command command) {
        command.execute();
    }
}
