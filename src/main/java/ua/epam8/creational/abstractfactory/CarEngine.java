package ua.epam8.creational.abstractfactory;

public class CarEngine implements Engine {
    public void design() {
        System.out.println("Проектируем двигатель автомобиля");
    }

    public void manufacture() {
        System.out.println("Производим двигатель автомобиля");
    }

    public void test() {
        System.out.println("Тестируем двигатель автомобиля");
    }
}
