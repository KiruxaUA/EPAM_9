package ua.epam8.structural.flyweight;

import java.util.Timer;
import java.util.TimerTask;

class Vehicle {
    private String name;
    private final String task;
    private String type;
    private String color;
    private int speed;
    private boolean active;
    private int duration;

    Vehicle(String name) {
        task = "Obstruct the racers";
        this.name = name;
    }

    void setProperties(String type, String color, int speed, int duration) {
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.duration = duration;
    }

    boolean isActive() {
        return active;
    }

    void addToTraffic() {
        System.out.println("->" + name + "-" + type + "-" + color + "-" + speed
            + "mph-" + duration + "seconds");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                active = false;
                System.out.println(name + "->out");
            }
        }, duration * 1000);
        active = true;
    }
}
