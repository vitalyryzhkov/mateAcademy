package lesson04;

public class MyStack<T> {
    private int size;
    private Object[] array;
    private int space;

    public MyStack(int size) {
        this.size = size;
        array = new Object[size];
    }

    public void push(char data) {
        if (space < size) {

            array[space++] = data;
        }
    }

    public T pop() {
        if (space > 0) {
            return (T) array[--space];
        }
        return null;
    }

    public void remove(int index) {
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        array[array.length - 1] = null;
    }

    public T peek() {
        if (space > 0) {
            return (T) array[space - 1];
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        array = new Object[0];
    }
}
