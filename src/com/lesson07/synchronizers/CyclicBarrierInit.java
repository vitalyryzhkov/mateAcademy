package com.lesson07.synchronizers;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierInit {
    private static CyclicBarrier cyclicBarrier;
    private static final int SIZE = 3;

    public static void main(String[] args) throws Exception {

        int count = 10;

        cyclicBarrier = new CyclicBarrier(SIZE, new Taxi());

        for (int i = 1; i < count; i++) {
            new Thread(new Human(i)).start();
            Thread.sleep(400);
        }
    }

    private static class Taxi implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Human come in");
                Thread.sleep(500);
                System.out.println("Taxi delivered humans\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class Human implements Runnable {
        private int humanNumber;

        Human(int carNumber) {
            this.humanNumber = carNumber;
        }

        @Override
        public void run() {
            try {
                System.out.println("Man come to taxi \n" + humanNumber);
                cyclicBarrier.await();
                System.out.println("Man " + humanNumber + " going\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
