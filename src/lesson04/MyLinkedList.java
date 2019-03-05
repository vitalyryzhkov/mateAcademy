package lesson04;

public class MyLinkedList<T> implements List<T> {
    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
    }

    @Override
    public T get(int index) {
        if (index < 0 && index >= size) {
            System.out.println("Enter correct index");
        }
        return node(index).item;
    }

    @Override
    public void add(T t) {
        Node<T> currentNode = first;
        if (currentNode == null) {
            Node<T> last = this.last;
            Node<T> newNode = new Node<>(last, t, null);
            this.last = newNode;
            if (last == null)
                currentNode = newNode;
            else
                last.next = newNode;
            size++;
        } else {
            Node<T> newNode = new Node<>(currentNode.prev, t, currentNode.next);
            currentNode.prev = newNode;
            currentNode.prev.next = newNode;
            size++;
        }
    }

    @Override
    public void remove(int index) {
        Node<T> node = last;
        if (index < size / 2) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            for (int i = size; i > index; i--) {
                node = node.prev;
            }
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        node.next = null;
        node.prev = null;
        node.item = null;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }


    Node<T> node(int index) {
        if (index < (size() / 2)) {
            Node<T> elem = first;
            for (int i = 0; i < index; i++) {
                elem = elem.next;
            }
            return elem;
        } else {
            Node<T> elem = last;
            for (int i = size - 1; i > index; i--) {
                elem = elem.prev;
            }
            return elem;
        }
    }

    static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
