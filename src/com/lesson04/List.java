package com.lesson04;

public interface List<T> {
    T get(int i);
    void add(T t);
    void remove(int i);
    int size();
    void clear();
}
