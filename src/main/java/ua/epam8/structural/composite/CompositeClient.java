package ua.epam8.structural.composite;

public class CompositeClient {
    public static void main(String[] args) {
        Product product1 = new Product(1);
        Product product2 = new Product(2);
        Product product3 = new Product(3);
        Product product4 = new Product(4);

        Box box1 = new Box(1);
        Box box2 = new Box(2);
        Box box3 = new Box(3);

        box1.add(product1);
        box1.add(product2);
        box1.add(product3);

        box2.add(product4);

        box3.add(box1);
        box3.add(box2);

        box3.print(0);
    }
}
