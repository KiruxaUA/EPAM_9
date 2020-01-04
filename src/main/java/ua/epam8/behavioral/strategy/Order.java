package ua.epam8.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Item> cart = new ArrayList<Item>();
    List<PaymentStrategy> payments = new ArrayList<PaymentStrategy>();

    private final String FORMAT = "%-20s %s";

    void addItem(Item item) {
        cart.add(item);
        System.out.println(String.format(FORMAT,
                item.getName(), item.getPrice()));
    }

    void makePayment(PaymentStrategy pm) {
        payments.add(pm);
        pm.pay();
    }
}
