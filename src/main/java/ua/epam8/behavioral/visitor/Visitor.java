package ua.epam8.behavioral.visitor;

public interface Visitor {
    void visit(FoodItem item);
    void visit(LiquorItem item);
}
