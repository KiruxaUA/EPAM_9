package ua.epam8.behavioral.observer;

public class CustomerDisplay extends Observer {
    public void update(String str) {
        System.out.println("[CustomerDisplay] " + str + " ");
    }
}
