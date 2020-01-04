package ua.epam8.creational.factory;

public class Truck implements Vehicle {
    Truck() {

    }

    public void design() {
        System.out.println("Проектируем грузовик");
    }

    public void manufacture() {
        System.out.println("Производим грузовик");
    }

    public void test() {
        System.out.println("Тестируем грузовик");
    }
}
