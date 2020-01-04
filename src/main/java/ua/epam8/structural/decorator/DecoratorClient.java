package ua.epam8.structural.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Item[] order = {
                new DeepFried(new Pizza()),
                new DoubleCheese(new DeepFried(new Pizza())),
                new Spicy(new DeepFried(new DoubleCheese(new Pizza())))
        };
        for(Item item : order) {
            item.prepare();
            System.out.println("  ");
        }
    }
}
