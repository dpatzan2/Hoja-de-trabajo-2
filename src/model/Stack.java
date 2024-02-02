package model;

import java.util.EmptyStackException;

public class Stack<T> {
    private Object[] array;
    private int size;

    public Stack() {
        array = new Object[10];
        size = 0;
    }

    public void push(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[size * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = (T) array[--size];
        array[size] = null;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
