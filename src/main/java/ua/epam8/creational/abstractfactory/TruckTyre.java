package ua.epam8.creational.abstractfactory;

public class TruckTyre implements Tyre {
    public void design() {
        System.out.println("Проектируем шины грузовика");
    }

    public void manufacture() {
        System.out.println("Производим шины грузовика");
    }
}
