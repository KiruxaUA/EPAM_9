package ua.epam8.creational.abstractfactory;

public class CarDoor implements Door {
    public void design() {
        System.out.println("Проектируем двери автомобиля");
    }

    public void manufacture() {
        System.out.println("Производим двери автомобиля");
    }

    public void test() {
        System.out.println("Тестируем двери автомобиля");
    }
}
