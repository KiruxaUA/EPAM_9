package ua.epam8.creational.factory;

public class Motorcycle implements Vehicle {
    Motorcycle() {

    }

    public void design() {
        System.out.println("Проектируем мотоцикл");
    }

    public void manufacture() {
        System.out.println("Производим мотоцикл");
    }

    public void test() {
        System.out.println("Тестируем мотоцикл");
    }
}
