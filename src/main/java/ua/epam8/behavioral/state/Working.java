package ua.epam8.behavioral.state;

public class Working implements AtmState {
    private Atm atm;

    Working(Atm atm) {
        this.atm = atm;
    }

    public void withdraw(int amount) {
        int cashStock = atm.getCashStock();
        if(amount > cashStock) {
            amount = cashStock;
            System.out.print("Partial amount ");
        }
        System.out.println(amount + "$ is dispensed");
        int newCashStock = cashStock - amount;
        atm.setCashStock(newCashStock);
        if(newCashStock == 0) {
            atm.setState(new NoCash(atm));
        }
    }

    public void refill(int amount) {
        System.out.println(amount + "$ is loaded");
        atm.setCashStock(atm.getCashStock() + amount);
    }
}
