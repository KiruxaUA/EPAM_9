package ua.epam8.structural.decorator;

public abstract class PizzaDecorator implements Item {
    private Item pizza;

    public PizzaDecorator(Item item) {
        pizza = item;
    }

    public void prepare() {
        pizza.prepare();
    }
}
