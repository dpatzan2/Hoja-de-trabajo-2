package model;

public class Vector {
    private int[] array;
    private int size;

    public Vector(int initialCapacity) {
        array = new int[initialCapacity];
        size = 0;
    }

    public void add(int element) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = element;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
}
