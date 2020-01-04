package ua.epam8.behavioral.chainofresponsibility;

class CashDispenser {
    private int denominator;
    private CashDispenser next = null;

    CashDispenser(int val) {
        this.denominator = val;
    }

    void setNextDispenser(CashDispenser d) {
        if(next == null) {
            next = d;
        }
        else {
            next.setNextDispenser(d);
        }
    }

    void dispense(int amount) {
        if(amount >= denominator) {
            int num = amount / denominator;
            int balance = amount % denominator;
            System.out.println(num + " * "
                + denominator + "$");
            if(balance != 0) {
                next.dispense(balance);
            }
        }
        else {
            next.dispense(amount);
        }
    }
}
