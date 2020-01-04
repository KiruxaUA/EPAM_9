package ua.epam8.behavioral.template;

public class MeatPizza extends Pizza {
    protected void addIngredients() {
        System.out.println("Added Meat Pizza ingredients");
    }

    protected void addToppings() {
        System.out.println("Added Meat Pizza toppings");
    }

    protected void cook() {
        System.out.println("Cooked for 15 minutes");
    }
}
