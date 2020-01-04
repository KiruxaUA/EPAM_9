package ua.epam8.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyOMS {
    List<Item> cart = new ArrayList<Item>();
    List<Payment> payments = new ArrayList<Payment>();

    public void addItem(Item itemXml) {
        cart.add(itemXml);
        System.out.println(itemXml.getName() + " " + itemXml.getPrice());
    }

    public void makePayment(Payment paymentXml) {
        payments.add(paymentXml);
        paymentXml.pay();
    }
}
