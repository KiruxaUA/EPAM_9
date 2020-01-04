package ua.epam8.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AtcMediatorImpl implements AtcMediator {
    private Runway runway;
    private List<Gate> gates;

    AtcMediatorImpl() {
        gates = new ArrayList<Gate>();
    }

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerGate(Gate gate) {
        gates.add(gate);
    }

    public boolean getLandingPermission(Flight flight) {
        if(!runway.isInUse()) {
            for(Gate gate: gates) {
                if(!gate.isInUse()) {
                    flight.allocateRunway(runway);
                    flight.allocateGate(gate);
                    return true;
                }
            }
            System.out.println("[ATC Mediator] All gates in use");
        }
        else {
            System.out.println("[ATC Mediator] Runway in use");
        }
        return false;
    }

    public boolean getTakeoffPermission(Flight flight) {
        return !runway.isInUse();
    }

    public void exitRunway(Runway runway) {
        runway.setInUse(false);
    }

    public void exitGate(Gate gate) {
        gate.setInUse(false);
    }

    public void enterRunway(Runway runway) {
        runway.setInUse(true);
    }

    public void enterGate(Gate gate) {
        gate.setInUse(true);
    }
}