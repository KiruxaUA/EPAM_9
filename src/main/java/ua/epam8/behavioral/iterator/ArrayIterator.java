package ua.epam8.behavioral.iterator;

public class ArrayIterator implements Iterator {
    private int[] arr;
    private int pos;
    private int len;

    public ArrayIterator(int[] arr, int len) {
        this.arr = arr;
        this.len = len;
        pos = -1;
    }

    public int next() {
        return arr[++pos];
    }

    public boolean hasNext() {
        return (pos + 1) < len;
    }
}
