package ua.epam8.structural.decorator;

public class Spicy extends PizzaDecorator {
    public Spicy(Item inner) {
        super(inner);
    }

    public void prepare() {
        super.prepare();
        System.out.println(" + Spicy");
    }
}
