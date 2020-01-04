package ua.epam8.structural.facade;

public class WeddingPlanner {
    private Hall hall;
    private Restaurant restaurant;
    private Photographer photographer;
    private Vehicle limousine;

    public WeddingPlanner() {
        hall = new Hall();
        photographer = new Photographer();
        restaurant = new Restaurant();
        limousine = new Vehicle();
    }

    public void organize() {
        hall.book();
        photographer.book();
        restaurant.placeOrder();
        limousine.reserve();
    }
}
