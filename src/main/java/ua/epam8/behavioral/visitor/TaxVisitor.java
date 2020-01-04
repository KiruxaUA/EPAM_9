package ua.epam8.behavioral.visitor;

public class TaxVisitor implements Visitor {
    private double totalTax;

    public void visit(FoodItem item) {
        double tax = item.getPrice() * 0.02;
        totalTax += tax;
        item.setPrice(item.getPrice() + tax);
    }

    public void visit(LiquorItem item) {
        double tax = item.getPrice() * 0.2;
        totalTax += tax;
        item.setPrice(item.getPrice() + tax);
    }

    double getTotalTax() {
        return totalTax;
    }
}
