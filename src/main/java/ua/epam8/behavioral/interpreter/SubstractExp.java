package ua.epam8.behavioral.interpreter;

public class SubstractExp implements Exp {
    private Exp first;
    private Exp second;

    public SubstractExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    public int evaluate() {
        return first.evaluate() - second.evaluate();
    }
}
