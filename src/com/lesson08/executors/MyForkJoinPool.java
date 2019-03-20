package com.lesson08.executors;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class MyForkJoinPool {
    public static void main(String[] args) {

        ForkJoinFibonacci task = new ForkJoinFibonacci(10);
        new ForkJoinPool().invoke(task);

        System.out.println(task.getNumber());
    }

public static class ForkJoinFibonacci extends RecursiveAction {

    private static final long LIMIT = 10;
    private long number;

    public ForkJoinFibonacci(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    @Override
    protected void compute() {
        long n = number;
        if (n <= LIMIT) {
            number = fib(n);
        } else {
            ForkJoinFibonacci f1 = new ForkJoinFibonacci(n - 1);
            ForkJoinFibonacci f2 = new ForkJoinFibonacci(n - 2);
            ForkJoinTask.invokeAll(f1, f2);
            number = f1.number + f2.number;
        }
    }
}
    private static long fib(long n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}
