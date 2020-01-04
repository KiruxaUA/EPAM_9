package ua.epam8.structural.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Draw Circle in ");
        color.applyColor();
    }
}
