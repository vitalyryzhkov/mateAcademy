package com.lesson08.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class MyThreadPoolExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10).mapToObj(ThreadRequest::new).forEachOrdered(executor::submit);
        executor.shutdown();
    }

    static class ThreadRequest implements Runnable {

        private int id;

        public ThreadRequest(int id) {
            this.id = id;
        }

        @Override
        public void run() {

            try {
                System.out.printf("Request # %d %s%n", id, Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
