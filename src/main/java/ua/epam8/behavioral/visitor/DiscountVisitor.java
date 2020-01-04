package ua.epam8.behavioral.visitor;

public class DiscountVisitor implements Visitor {
    private double totalDiscount;

    public void visit(FoodItem item) {
        double discount = item.getPrice() * 0.3;
        totalDiscount += discount;
        item.setPrice(item.getPrice() - discount);
    }

    public void visit(LiquorItem item) {
        double discount = item.getPrice() * 0.1;
        totalDiscount += discount;
        item.setPrice(item.getPrice() - discount);
    }

    double getTotalDiscount() {
        return totalDiscount;
    }
}
