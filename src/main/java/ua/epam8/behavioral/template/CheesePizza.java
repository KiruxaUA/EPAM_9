package ua.epam8.behavioral.template;

public class CheesePizza extends Pizza {
    protected void addIngredients() {
        System.out.println("Added Cheese Pizza Ingredients");
    }

    protected void addToppings() {
        System.out.println("Added Cheese Pizza toppings");
    }

    protected void cook() {
        System.out.println("Cooked for 10 minutes");
    }
}
