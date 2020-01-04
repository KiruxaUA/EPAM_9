package ua.epam8.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class NewOMS {
    List<Item> cart = new ArrayList<Item>();
    List<Payment> payments = new ArrayList<Payment>();

    public void addToBasket(Item itemJson) {
        cart.add(itemJson);
        System.out.println(itemJson.getName() + " " + itemJson.getPrice());
    }

    public void pay(Payment paymentJson) {
        payments.add(paymentJson);
        paymentJson.pay();
    }
}
