package com.lesson07.synchronizers;

import java.util.ArrayList;
import java.util.concurrent.Phaser;
import java.util.stream.IntStream;

public class ExPhaser {
    private static Phaser PHASER = new Phaser(1);

    public static void main(String[] args) {

        ArrayList<Passenger> passengers = new ArrayList<>();
        IntStream.range(1, 5).forEachOrdered(i -> {
            if ((int) (Math.random() * 2) > 0) {
                passengers.add(new Passenger(10 + i, i, i + 1));
                Passenger p = new Passenger(20 + i, i, 5);
                passengers.add(p);
            }
        });

        int i = 0;
        while (i < 7) {
            switch (i) {
                case 0:
                    System.out.println("Train going");
                    PHASER.arrive();
                    break;
                case 6:
                    System.out.println("Train stay");
                    PHASER.arriveAndDeregister();
                    break;
                default:
                    int currentStation = PHASER.getPhase();
                    System.out.println("Station " + currentStation);
                    for (Passenger pass : passengers)
                        if (pass.departure == currentStation) {
                            PHASER.register();
                            new Thread(pass).start();
                        }
                    System.out.println("open doors");

                    PHASER.arriveAndAwaitAdvance();

                    System.out.println("close doors");
            }
            i++;
        }
    }
    public static class Passenger implements Runnable {

        int id;
        int departure;
        int destination;

        public Passenger(int id, int departure, int destination) {
            this.id = id;
            this.departure = departure;
            this.destination = destination;
            System.out.println(this + " waiting " + departure);
        }

        @Override
        public void run() {
            try {
                System.out.println(" " + this + " ");
                while (PHASER.getPhase() < destination)
                    PHASER.arriveAndAwaitAdvance();
                Thread.sleep(500);
                System.out.println(" " + this + " exit");
                PHASER.arriveAndDeregister();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "Passenger " + id +
                    " {" + departure + " -> " + destination + '}';
        }
    }
}
