package com.lesson07.concurrentcollections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite extends Thread {

    private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public void run() {
        list.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        list.add("A");
        list.add("B");
        list.add("C");

        new CopyOnWrite().start();

        Thread.sleep(1000);
        list.forEach(System.out::println);
        Thread.sleep(1000);
        System.out.println(list);
    }
}
