package ua.epam8.structural.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color c) {
        color = c;
    }

    public abstract void draw();
}
