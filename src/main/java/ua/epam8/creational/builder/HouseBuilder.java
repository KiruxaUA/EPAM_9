package ua.epam8.creational.builder;

public interface HouseBuilder {
    HouseBuilder buildFloor();
    HouseBuilder buildWall();
    HouseBuilder buildRoof();
    House build();
}
