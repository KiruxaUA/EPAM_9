package ua.epam8.behavioral.iterator;

public class LinkedList implements Collection {
    private Node head;
    private Node current;

    public  void insert(int val) {
        Node node = new Node(val);
        if(current == null) {
            head = node;
            current = node;
        }
        else {
            current.next = node;
            current = node;
        }
    }

    public Iterator getIterator() {
        return new ListIterator(head);
    }

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int data() {
            return data;
        }

        public Node next() {
            return this.next;
        }
    }
}
