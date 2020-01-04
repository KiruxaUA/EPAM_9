package ua.epam8.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {
    public static void main(String[] args) {
        List<Visitable> order = new ArrayList<Visitable>();
        order.add(new FoodItem(1, "Italian Pizza", 6.99));
        order.add(new LiquorItem(1, "Wine", 9.99));
        order.add(new LiquorItem(1, "Beer", 5.99));
        order.add(new FoodItem(1, "Red Apple", 1.49));
        order.add(new FoodItem(1, "Almonds", 11.99));

        DiscountVisitor discountVisitor = new DiscountVisitor();
        TaxVisitor taxVisitor = new TaxVisitor();

        for(Visitable item: order) {
            item.apply(discountVisitor);
            item.apply(taxVisitor);
        }

        System.out.println("Total Discount = " +
                discountVisitor.getTotalDiscount());
        System.out.println("Total Tax = " +
                taxVisitor.getTotalTax());
    }
}
