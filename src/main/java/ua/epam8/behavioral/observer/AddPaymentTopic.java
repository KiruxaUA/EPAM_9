package ua.epam8.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {
    private List<Observer> addPaymentObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for(Observer o: addPaymentObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        addPaymentObservers.add(o);
    }
}
