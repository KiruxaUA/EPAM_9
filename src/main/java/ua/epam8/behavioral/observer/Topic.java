package ua.epam8.behavioral.observer;

public interface Topic {
    void register(Observer obj);
    void notifyObservers(String line);
}
