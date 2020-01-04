package ua.epam8.structural.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Draw Square in ");
        color.applyColor();
    }
}
