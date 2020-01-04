package ua.epam8.creational.abstractfactory;

public class UnknownVehicleException extends Exception {
    UnknownVehicleException() {
        super("Неопределенный вид транспорта!");
    }
}
