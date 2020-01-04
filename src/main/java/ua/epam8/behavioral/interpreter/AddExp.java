package ua.epam8.behavioral.interpreter;

public class AddExp implements Exp {
    private Exp first;
    private Exp second;

    public AddExp(Exp first, Exp second) {
        this.first = first;
        this.second = second;
    }

    public int evaluate() {
        return first.evaluate() + second.evaluate();
    }
}
