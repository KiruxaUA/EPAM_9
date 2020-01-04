package ua.epam8.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {
    private List<Observer> addItemObservers = new ArrayList<Observer>();

    public void notifyObservers(String line) {
        for(Observer o: addItemObservers) {
            o.update(line);
        }
    }

    public void register(Observer o) {
        addItemObservers.add(o);
    }
}
