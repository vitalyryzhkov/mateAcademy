package com.lesson04;

public class MyStack<T> implements Stack<T> {
    private int size;
    private Object[] array;
    private int space;

    public MyStack(int size) {
        this.size = size;
        array = new Object[size];
    }

    @Override
    public void push(T item) {
        if (space < size) {

            array[space++] = item;
        }
    }

    @Override
    public T pop() {
        if (space > 0) {
            return (T) array[--space];
        }
        return null;
    }

    @Override
    public void remove(int index) {
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        array[array.length - 1] = null;
    }

    @Override
    public T peek() {
        if (space > 0) {
            return (T) array[space - 1];
        }
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[0];
    }
}
