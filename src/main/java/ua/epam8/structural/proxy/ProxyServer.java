package ua.epam8.structural.proxy;

public class ProxyServer implements Server {
    private RealServer realServer;
    private boolean sessionActive;

    public ProxyServer() {
        this.realServer = new RealServer();
        sessionActive = false;
    }

    public void authenticate() {
        realServer.authenticate();
        sessionActive = true;
    }

    public void get() {
        if(sessionActive) {
            realServer.get();
        }
        else {
            System.out.println("Invalid Session");
        }
    }

    public void post() {
        if(sessionActive) {
            realServer.post();
        }
        else {
            System.out.println("Invalid Session");
        }
    }

    public void put() {
        if(sessionActive) {
            realServer.put();
        }
        else {
            System.out.println("Invalid session");
        }
    }

    public void delete() {
        if(sessionActive) {
            realServer.delete();
        }
        else {
            System.out.println("Invalid session");
        }
    }

    public void logout() {
        realServer.logout();
        sessionActive = false;
    }
}
