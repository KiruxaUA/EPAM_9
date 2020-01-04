package ua.epam8.creational.abstractfactory;

public abstract class Factory {

    /* Singleton Factory objects */
    private static Factory carFactory = null;
    private static Factory truckFactory = null;

    public abstract Engine getEngine();
    public abstract Tyre getTyre();
    public abstract Door getDoor();

    static Factory getFactory(int vehicleType)
            throws UnknownVehicleException {

        Factory factory = null;
        switch (vehicleType) {
            case 1:
                if(carFactory == null) {
                    carFactory = new CarFactory();
                }
                factory = carFactory;
                break;
            case 2:
                if(truckFactory == null) {
                    truckFactory = new TruckFactory();
                }
                factory = truckFactory;
                break;
            default:
                throw new UnknownVehicleException();
        }

        return factory;
    }
}
