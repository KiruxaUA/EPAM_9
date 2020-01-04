package ua.epam8.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для выбора типа объекта нажмите: 1 - Car, 2 - Truck");
        int vehicleType = in.nextInt();

        Factory factory;
        try {
            factory = Factory.getFactory(vehicleType);

            Engine engine = factory.getEngine();
            engine.design();
            engine.manufacture();
            engine.test();

            Tyre tyre = factory.getTyre();
            tyre.design();
            tyre.manufacture();

            Door door = factory.getDoor();
            door.design();
            door.manufacture();
            door.test();
        } catch (UnknownVehicleException e) {
            System.out.println("Введен неверный тип транспорта!");
        }
        in.close();
    }
}
