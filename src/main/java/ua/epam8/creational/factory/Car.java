package ua.epam8.creational.factory;

public class Car implements Vehicle {
    Car() {

    }

    public void design() {
        System.out.println("Проектируем автомобиль");
    }

    public void manufacture() {
        System.out.println("Производим автомобиль");
    }

    public void test() {
        System.out.println("Тестируем автомобиль");
    }
}
