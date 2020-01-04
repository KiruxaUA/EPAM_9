package ua.epam8.behavioral.interpreter;

public class Number implements Exp {
    private final int n;

    public Number(int n) {
        this.n = n;
    }

    public int evaluate() {
        return n;
    }
}
