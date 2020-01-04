package ua.epam8.creational.abstractfactory;

public class CarTyre implements Tyre {
    public void design() {
        System.out.println("Проектируем шины автомобиля");
    }

    public void manufacture() {
        System.out.println("Производим шины автомобиля");
    }
}
