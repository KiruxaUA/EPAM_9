package ua.epam8.behavioral.iterator;

public class Array implements Collection {
    private int[] arr;
    private int len;

    Array(int size) {
        arr = new int[size];
        len = 0;
    }

    public void insert(int val) {
        arr[len++] = val;
    }

    public Iterator getIterator() {
        return new ArrayIterator(arr, len);
    }
}
