package ua.epam8.behavioral.mediator;

public class Runway {
    private String runwayNum;
    private boolean inUse;

    Runway(String runwayNum, boolean inUse) {
        this.runwayNum = runwayNum;
        this.inUse = inUse;
    }

    public String getRunwayNum() {
        return runwayNum;
    }

    public void setRunwayNum(String runwayNum) {
        this.runwayNum = runwayNum;
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
