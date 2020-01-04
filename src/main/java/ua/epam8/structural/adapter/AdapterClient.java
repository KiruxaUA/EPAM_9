package ua.epam8.structural.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        OMSAdapter oms = new OMSAdapter();

        oms.addItem(new Item("Italian Pizza", 6.99));
        oms.addItem(new Item("Wine", 9.99));
        oms.addItem(new Item("Beer", 5.99));
        oms.addItem(new Item("Red Apple", 1.49));
        oms.addItem(new Item("Almonds", 11.99));

        System.out.println("----------------------------");
        oms.makePayment(new Payment("CASH", 20.00));
        oms.makePayment(new Payment("CREDIT", 10.00));
        oms.makePayment(new Payment("DEBIT", 10.00));
        System.out.println("----------------------------");
    }
}
