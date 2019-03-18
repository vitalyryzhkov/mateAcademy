package com.lesson07.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWrite extends Thread {

    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Integer object = null;

    void getObject() {

        Lock readLock = readWriteLock.readLock();
        readLock.lock();
        try {
            System.out.println("Ready to read " + object);
            sleep(1000);
            System.out.println("Read " + object);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readLock.unlock();
        }
    }

    void setObject(Integer object) {
        Lock writeLock = readWriteLock.writeLock();
        writeLock.lock();
        try {
            System.out.println("Ready to write " + object);
            sleep(1000);
            System.out.println("Wrote " + object);
            this.object = object;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }
}