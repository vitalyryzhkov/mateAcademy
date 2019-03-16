package com.lesson04;

public interface Stack<T> {
    void push(T t);
    T pop();
    void remove(int i);
    T peek();
    int getSize();
    void clear();
}
