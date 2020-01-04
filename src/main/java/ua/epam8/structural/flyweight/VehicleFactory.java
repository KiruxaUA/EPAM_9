package ua.epam8.structural.flyweight;

import java.util.Vector;

class VehicleFactory {
    private Vector<Vehicle> pool = new Vector<Vehicle>();

    VehicleFactory() {
        for(int i = 0; i < 5; i++) {
            pool.add(new Vehicle("v" + (i + 1)));
        }
    }

    Vehicle getVehicle(String type, String color, int speed, int duration) {
        for(Vehicle v : pool) {
            if(!v.isActive()) {
                v.setProperties(type, color, speed, duration);
                return v;
            }
        }
        return null;
    }
}
