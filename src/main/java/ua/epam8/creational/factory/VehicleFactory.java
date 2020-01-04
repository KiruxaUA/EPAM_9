package ua.epam8.creational.factory;

public class VehicleFactory {
    public Vehicle getVehicle(int vehicleType)
        throws VehicleTypeNotFoundException {

        Vehicle vehicle = null;
        switch(vehicleType) {
            case 1:
                vehicle = new Car();
                break;
            case 2:
                vehicle = new Truck();
                break;
            case 3:
                vehicle = new Motorcycle();
                break;
            default:
                throw new VehicleTypeNotFoundException();
        }
        return vehicle;
    }
}
