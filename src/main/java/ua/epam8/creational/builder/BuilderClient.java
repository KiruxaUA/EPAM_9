package ua.epam8.creational.builder;

public class BuilderClient {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseBuildDirector houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());

        builder = new WoodenHouseBuilder();
        houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());
    }
}
