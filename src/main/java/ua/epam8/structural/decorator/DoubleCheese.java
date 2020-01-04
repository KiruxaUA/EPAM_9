package ua.epam8.structural.decorator;

public class DoubleCheese extends PizzaDecorator {
    public DoubleCheese(Item inner) {
        super(inner);
    }

    public void prepare() {
        super.prepare();
        System.out.println(" + Double Cheese");
    }
}
