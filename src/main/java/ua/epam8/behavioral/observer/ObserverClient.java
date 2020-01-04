package ua.epam8.behavioral.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Pizza", 6.99));
        order.addItem(new Item("Wine", 9.99));
        order.addItem(new Item("Beer", 5.99));
        order.addItem(new Item("Apple", 1.49));

        System.out.println("--------------------------------------------");

        order.makePayment(new Payment("CASH", 20.00));
        order.makePayment(new Payment("CREDIT", 10.00));
        order.makePayment(new Payment("DEBIT", 10.00));

        System.out.println("--------------------------------------------");

        order.completeOrder();
    }
}
