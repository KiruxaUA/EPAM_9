package ua.epam8.behavioral.visitor;

public class FoodItem implements Visitable {
    private int id;
    private String name;
    private double price;

    FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public void apply(Visitor visitor) {
        visitor.visit(this);
    }
}
