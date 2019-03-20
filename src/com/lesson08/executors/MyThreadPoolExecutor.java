package com.lesson08.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

public class MyThreadPoolExecutor {
    public static void main(String[] args) {

        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        IntStream.range(0, 10).mapToObj(TpeRequest::new).forEachOrdered(poolExecutor::submit);
        poolExecutor.shutdown();
    }

    static class TpeRequest implements Runnable {

        private int id;

        public TpeRequest(int id) {
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
