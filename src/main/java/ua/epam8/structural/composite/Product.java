package ua.epam8.structural.composite;

public class Product implements Item {
    private int id;

    Product(int id) {
        this.id = id;
    }

    public void print(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println("Product" + id);
    }
}
