package ua.epam8.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Draw Rectangle in ");
        color.applyColor();
    }
}
