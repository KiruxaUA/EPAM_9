package ua.epam8.creational.builder;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    public HouseBuilder buildFloor() {
        house.setFloorType("Бетон");
        return this;
    }

    public HouseBuilder buildWall() {
        house.setWallType("Бетон");
        return this;
    }

    public HouseBuilder buildRoof() {
        house.setRoofType("Бетон");
        return this;
    }

    public House build() {
        return house;
    }
}
