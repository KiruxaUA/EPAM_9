package ua.epam8.behavioral.command;

public class CommandClient {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        MainDish item1 = new MainDish("Pizza");
        OrderMainDish command1 = new OrderMainDish(item1);
        waiter.execute(command1);

        MainDish item2 = new MainDish("Burger");
        OrderMainDish command2 = new OrderMainDish(item2);
        waiter.execute(command2);

        CancelMainDish command3 = new CancelMainDish(item2);
        waiter.execute(command3);

        Dessert item3 = new Dessert("Icecream");
        OrderDessert command4 = new OrderDessert(item3);
        waiter.execute(command4);
    }
}
