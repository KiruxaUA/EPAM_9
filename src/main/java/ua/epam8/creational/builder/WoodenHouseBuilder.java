package ua.epam8.creational.builder;

public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder() {
        house = new House();
    }

    public HouseBuilder buildFloor() {
        house.setFloorType("Дерево");
        return this;
    }

    public HouseBuilder buildWall() {
        house.setWallType("Дерево");
        return this;
    }

    public HouseBuilder buildRoof() {
        house.setRoofType("Дерево");
        return this;
    }

    public House build() {
        return house;
    }
}
