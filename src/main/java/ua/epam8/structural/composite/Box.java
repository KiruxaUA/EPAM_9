package ua.epam8.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {
    private int id;

    private List<Item> items = new ArrayList<Item>();

    Box(int id) {
        this.id = id;
    }

    public void print(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println("Box" + id);
        for(Item item: items) {
            item.print(level + 1);
        }
    }

    void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }
}
