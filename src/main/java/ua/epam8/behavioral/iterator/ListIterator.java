package ua.epam8.behavioral.iterator;

public class ListIterator implements Iterator {
    private LinkedList.Node current;

    ListIterator(LinkedList.Node head) {
        this.current = head;
    }

    public int next() {
        int val = current.data();
        current = current.next();
        return val;
    }

    public boolean hasNext() {
        return current != null;
    }
}
