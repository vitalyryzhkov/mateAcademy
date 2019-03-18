package com.lesson07.atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class ExAtomicInteger implements Runnable {

    public static void main(String[] args) {

        new Thread(new ExAtomicInteger()).start();

    }

    public class Entry {

        AtomicInteger atomicInt = new AtomicInteger(0);

        void enter() {
            System.out.println("Counter Enter:" + atomicInt.incrementAndGet());
        }

        void exit() {
            System.out.println("Counter Exit:" + atomicInt.decrementAndGet());
        }

        void getCount() {
            System.out.println("total counter:" + atomicInt);
        }
    }

    public void run() {
        Entry entry = new Entry();
        try {
            entry.enter();
            entry.exit();
            entry.getCount();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
