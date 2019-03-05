package lesson04;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] array;

    MyArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    MyArrayList(int size) {
        array = new Object[size];

    }

    @Override
    public T get(int i) {
        if (i >= size() || i < 0) {
            throw new IndexOutOfBoundsException("Enter correct index from " + 0 + " to " + (size() - 1));
        }
        return (T) array[i];
    }

    @Override
    public void add(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1] != null) {
                arrayPlus(array);
            } else if (array[i] == null) {
                array[i] = t;
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
    public void remove(int i) {
        if (array.length - 1 - i >= 0) {
            System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
        }
        array[array.length - 1] = null;
    }

    @Override
    public int size() {
        return array.length;
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
