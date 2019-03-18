package com.lesson07.locks;

import java.util.stream.IntStream;

public class ReadWriteLock {
    public static void main(String[] args) {
        ReadWrite readWrite = new ReadWrite();
        IntStream.range(0, 10).forEach(i -> {
            new Thread(readWrite::getObject).start();
            int newI = i + 1;
            new Thread(() -> readWrite.setObject(newI)).start();
        });
    }
}
