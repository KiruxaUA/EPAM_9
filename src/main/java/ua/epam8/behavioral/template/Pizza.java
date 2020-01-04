package ua.epam8.behavioral.template;

public abstract class Pizza {
    public final void preparePizza() {
        selectCrust();
        addIngredients();
        addToppings();
        cook();
    }

    abstract void addToppings();
    abstract void addIngredients();

    void selectCrust() {
        System.out.println("Selected default Crust");
    }

    void cook() {
        System.out.println("Cooked for 5 minutes");
    }

}
