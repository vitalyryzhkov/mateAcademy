package com.lesson08.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class MyExecutorService {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        IntStream.range(0, 10).mapToObj(i -> new SomeThread("Some thread # " + i)).forEach(executor::execute);

        executor.shutdown();
    }

    public static class SomeThread implements Runnable {
        private String name;

        public SomeThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name);
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
