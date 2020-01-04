package ua.epam8.creational.abstractfactory;

public class TruckEngine implements Engine {
    public void design() {
        System.out.println("Проектируем двигатель грузовика");
    }

    public void manufacture() {
        System.out.println("Производим двигатель грузовика");
    }

    public void test() {
        System.out.println("Тестируем двигатель грузовика");
    }
}
