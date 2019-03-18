package com.lesson07.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockInit {

    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    public static void main(String[] args) {

        final int loop = 6;
        final LockInit counter = new LockInit();

        new Thread(() -> {
            while (counter.getCount() < loop) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (counter.getCount() < loop) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    private int getCount() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " get count: " + count);
            return count++;
        } finally {
            lock.unlock();
        }
    }
}
