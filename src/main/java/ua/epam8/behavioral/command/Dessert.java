package ua.epam8.behavioral.command;

public class Dessert {
    private String name;

    public Dessert(String name) {
        this.name = name;
    }

    public void order() {
        System.out.println("Dessert (" + name + ") is ordered");
    }

    public void cancel() {
        System.out.println("Dessert (" + name + ") is cancelled");
    }
}
