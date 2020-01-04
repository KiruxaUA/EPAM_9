package ua.epam8.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Item> cart = new ArrayList<Item>();
    private List<Payment> payments = new ArrayList<Payment>();

    private Topic addItemTopic;
    private Topic addPaymentTopic;
    private Topic completeOrderTopic;

    Order() {
        Observer cashierDisplay = new CashierDisplay();
        Observer customerDisplay = new CustomerDisplay();

        addItemTopic = new AddItemTopic();
        addPaymentTopic = new AddPaymentTopic();
        completeOrderTopic = new CompleteOrderTopic();

        addItemTopic.register(cashierDisplay);
        addPaymentTopic.register(cashierDisplay);
        completeOrderTopic.register(cashierDisplay);

        addItemTopic.register(customerDisplay);
        addPaymentTopic.register(customerDisplay);
        completeOrderTopic.register(customerDisplay);
    }

    void addItem(Item item) {
        cart.add(item);
        String line = item.name + " $" + item.price;
        addItemTopic.notifyObservers(line);
    }

    void makePayment(Payment payment) {
        payments.add(payment);
        String line = payment.type + " $" + payment.amount;
        addPaymentTopic.notifyObservers(line);
    }

    void completeOrder() {
        String line = "Order completed";
        completeOrderTopic.notifyObservers(line);
    }
}
