package ua.epam8.structural.decorator;

public class DeepFried extends PizzaDecorator {
    public DeepFried(Item inner) {
        super(inner);
    }

    public void prepare() {
        super.prepare();
        System.out.println(" + Deep Fried");
    }
}
