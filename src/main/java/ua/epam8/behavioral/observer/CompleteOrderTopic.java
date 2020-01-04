package ua.epam8.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {
    private List<Observer> orderCompletedObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for(Observer o: orderCompletedObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        orderCompletedObservers.add(o);
    }
}
