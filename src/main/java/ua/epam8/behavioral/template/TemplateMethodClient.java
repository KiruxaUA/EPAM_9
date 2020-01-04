package ua.epam8.behavioral.template;

public class TemplateMethodClient {
    public static void main(String[] args) {
        System.out.println("Preparing a Cheese Pizza ");
        Pizza pizza1 = new CheesePizza();
        pizza1.preparePizza();

        System.out.println();

        System.out.println("Preparing a Meat Pizza");
        Pizza pizza2 = new MeatPizza();
        pizza2.preparePizza();
    }
}
