package ua.epam8.structural.proxy;

public class RealServer implements Server {
    public void authenticate() {
        System.out.println("Logged into the Real Server");
    }

    public void get() {
        System.out.println("GET command executed");
    }

    public void post() {
        System.out.println("POST command executed");
    }

    public void put() {
        System.out.println("PUT command executed");
    }

    public void delete() {
        System.out.println("DELETE command executed");
    }

    public void logout() {
        System.out.println("Logged out from thr Real Server");
    }
}
