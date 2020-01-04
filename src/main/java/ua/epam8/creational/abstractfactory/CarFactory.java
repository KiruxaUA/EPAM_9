package ua.epam8.creational.abstractfactory;

public class CarFactory extends Factory {
    @Override
    public Engine getEngine() {
        return new CarEngine();
    }

    @Override
    public Tyre getTyre() {
        return new CarTyre();
    }

    @Override
    public Door getDoor() {
        return new CarDoor();
    }
}
