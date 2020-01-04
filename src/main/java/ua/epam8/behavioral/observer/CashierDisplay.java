package ua.epam8.behavioral.observer;

public class CashierDisplay extends Observer {
    public void update(String str) {
        System.out.print("[CashierDisplay] " + str + " ");
    }
}
