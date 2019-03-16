package com.lesson04;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] array;
    private int counter = 0;

    MyArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    MyArrayList(int size) {
        array = new Object[size];

    }

    @Override
    public T get(int index) {
        if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("Enter correct index from " + 0 + " to " + (size() - 1));
        }
        return (T) array[index];
    }

    @Override
    public void add(T item) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1] != null) {
                arrayPlus(array);
            } else if (array[i] == null) {
                array[i] = item;
                counter++;
                break;
            }
        }
    }

    private Object[] arrayPlus(Object[] array) {
        int newLength = (array.length * 15 / 10) + 1;
        this.array = Arrays.copyOf(array, newLength);
        return this.array;
    }

    @Override
    public void remove(int index) {
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        array[array.length - 1] = null;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void clear() {
        array = new Object[0];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array);
    }
}
