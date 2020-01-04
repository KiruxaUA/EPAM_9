package ua.epam8.structural.proxy;

public interface Server {
    void authenticate();
    void get();
    void post();
    void put();
    void delete();
    void logout();
}
