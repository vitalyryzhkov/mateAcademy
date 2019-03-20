package com.lesson08.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledFuture {
    public static void main(String[] args) {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable first = () -> System.out.println("First");
        Runnable second = () -> System.out.println("Second");

        ses.schedule(first, 2, TimeUnit.SECONDS);

        System.out.println("Third");

        ses.schedule(second, 5, TimeUnit.SECONDS);

        System.out.println("Fourth");

        ses.shutdown();
    }
}
