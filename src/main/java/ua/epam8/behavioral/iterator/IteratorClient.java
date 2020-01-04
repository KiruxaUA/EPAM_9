package ua.epam8.behavioral.iterator;

public class IteratorClient {
    public static void main(String[] args) {
        Collection arr = new Array(4);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        iterate(arr.getIterator());

        Collection list = new LinkedList();
        list.insert(11);
        list.insert(22);
        list.insert(33);
        iterate(list.getIterator());
    }

    private static void iterate(Iterator it) {
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
