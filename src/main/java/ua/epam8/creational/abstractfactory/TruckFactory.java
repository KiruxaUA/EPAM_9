package ua.epam8.creational.abstractfactory;

public class TruckFactory extends Factory {
    @Override
    public Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    public Tyre getTyre() {
        return new TruckTyre();
    }

    @Override
    public Door getDoor() {
        return new TruckDoor();
    }
}
