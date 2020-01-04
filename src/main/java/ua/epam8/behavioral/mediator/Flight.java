package ua.epam8.behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class Flight {
    private AtcMediator atc;
    private String flightNum;
    private Runway runway;
    private Gate gate;

    Flight(AtcMediator atc, String flightNum) {
        this.atc = atc;
        this.flightNum = flightNum;
    }

    public String getName() {
        return flightNum;
    }

    public Runway getRunway() {
        return runway;
    }

    void allocateRunway(Runway runway) {
        this.runway = runway;
    }

    public Gate getGate() {
        return gate;
    }

    void allocateGate(Gate gate) {
        this.gate = gate;
    }

    void landAndTakeOff() throws InterruptedException {
        System.out.println(flightNum + " is requesting landing permission");
        while (!atc.getLandingPermission(this)) {
            Thread.sleep(1000);
        }
        land();

        while (!atc.getTakeoffPermission(this)) {
            Thread.sleep(1000);
        }
        takeOff();
    }

    private void land() {
        atc.enterRunway(runway);
        System.out.println(this.flightNum + " is landing, gate is "
            + gate.getGateNum());

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                atc.exitRunway(runway);
                atc.exitGate(gate);
            }
        }, 1000);
    }

    private void takeOff() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(flightNum + " is taking off");
                atc.exitGate(gate);
                atc.enterRunway(runway);

                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        atc.exitRunway(runway);
                    }
                }, 1000);
            }
        }, 5000);
    }
}
