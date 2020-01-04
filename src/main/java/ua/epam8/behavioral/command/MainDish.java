package ua.epam8.behavioral.command;

public class MainDish {
    private String name;

    public MainDish(String name) {
        this.name = name;
    }

    public void order() {
        System.out.println("Main Dish (" + name + ") is ordered");
    }

    public void cancel() {
        System.out.println("Main Dish (" + name + ") is cancelled");
    }
}
