package ua.epam8.behavioral.mediator;

class Gate {
    private String gateNum;
    private boolean inUse;

    Gate(String gateNum, boolean inUse) {
        this.gateNum = gateNum;
        this.inUse = inUse;
    }

    String getGateNum() {
        return gateNum;
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
