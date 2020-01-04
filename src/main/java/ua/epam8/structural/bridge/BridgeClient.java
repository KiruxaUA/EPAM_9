package ua.epam8.structural.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(new Red()),
                new Square(new Green()),
                new Rectangle(new Blue())
        };
        for(Shape shape : shapes) {
            shape.draw();
        }
    }
}
