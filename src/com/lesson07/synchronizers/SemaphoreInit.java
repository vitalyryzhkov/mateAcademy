package com.lesson07.synchronizers;

import java.util.concurrent.Semaphore;

public class SemaphoreInit {
    private static int permits = 2;
    private static Semaphore semaphore = new Semaphore(permits);

    public static void main(String[] args) {
        NewThread(1);
        NewThread(2);
        NewThread(3);
    }

    static void NewThread(int i) {
        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println(i);
                Thread.sleep(500);
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ).start();
    }
}
