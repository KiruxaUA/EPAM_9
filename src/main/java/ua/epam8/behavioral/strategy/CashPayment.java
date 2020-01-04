package ua.epam8.behavioral.strategy;

public class CashPayment implements PaymentStrategy {
    private double amount;

    CashPayment(double amount) {
        this.amount = amount;
    }

    public void pay() {
        System.out.println("Cash" + amount + "$");
    }
}
