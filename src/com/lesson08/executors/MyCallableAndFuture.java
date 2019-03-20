package com.lesson08.executors;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyCallableAndFuture implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Callable<String> callable = new MyCallableAndFuture();
        List<Future> list = IntStream.range(0, 10).mapToObj(i -> executor.submit(callable)).collect(Collectors.toList());
        list.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
    }
}
