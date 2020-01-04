package ua.epam8.behavioral.state;

public class StateClient {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.refill(100);
        atm.withdraw(50);
        atm.withdraw(30);
        atm.withdraw(30);
        atm.withdraw(20);
        atm.refill(50);
        atm.withdraw(50);
    }
}
