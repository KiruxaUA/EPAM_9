package ua.epam8.creational.factory;

import java.util.Scanner;

public class FactoryMethodClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для выбора типа объекта нажмите: 1 - Car, 2 - Truck, 3 - Motorcycle");
        int vehicleType = in.nextInt();

        VehicleFactory factory = new VehicleFactory();
        try {
            Vehicle vehicle = factory.getVehicle(vehicleType);
            vehicle.design();
            vehicle.manufacture();
            vehicle.test();
        } catch (VehicleTypeNotFoundException e) {
            System.out.println("Неопределенный вид транспорта!");
        }
        in.close();
    }
}
