package ua.epam8.behavioral.state;

public class NoCash implements AtmState {
    private Atm atm;

    NoCash(Atm atm) {
        this.atm = atm;
    }

    public void withdraw(int amount) {
        System.out.println("Out of cash");
    }

    public void refill(int amount) {
        System.out.println(amount + "$ is loaded");
        atm.setState(new Working(atm));
        atm.setCashStock(atm.getCashStock() + amount);
    }
}
