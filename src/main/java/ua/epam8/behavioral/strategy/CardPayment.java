package ua.epam8.behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    private String cardType;
    private String issuer;
    public double amount;

    CardPayment(String cardType, String issuer, double amount) {
        super();
        this.cardType = cardType;
        this.issuer = issuer;
        this.amount = amount;
    }

    public void pay() {
        System.out.println(issuer + " " + cardType + " " + amount + "$");
    }
}
