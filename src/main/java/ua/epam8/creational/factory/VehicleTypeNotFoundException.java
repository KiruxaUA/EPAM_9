package ua.epam8.creational.factory;

public class VehicleTypeNotFoundException extends Exception {
    VehicleTypeNotFoundException() {
        super("Неопределенный вид транспорта!");
    }
}
