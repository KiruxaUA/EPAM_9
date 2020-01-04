package ua.epam8.creational.abstractfactory;

public class TruckDoor implements Door {
    public void design() {
        System.out.println("Проектируем двери грузовика");
    }

    public void manufacture() {
        System.out.println("Производим двери грузовика");
    }

    public void test() {
        System.out.println("Тестируем двери грузовика");
    }
}
