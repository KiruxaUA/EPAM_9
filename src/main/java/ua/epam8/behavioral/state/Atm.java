package ua.epam8.behavioral.state;

public class Atm implements AtmState {
    private int cashStock;
    private AtmState currentState;

    Atm() {
        currentState = new NoCash(this);
    }

    int getCashStock() {
        return cashStock;
    }

    void setCashStock(int CashStock) {
        this.cashStock = CashStock;
    }

    void setState(AtmState state) {
        currentState = state;
    }

    public AtmState getState() {
        return currentState;
    }

    public void withdraw(int amount) {
        currentState.withdraw(amount);
    }

    public void refill(int amount) {
        currentState.refill(amount);
    }
}
