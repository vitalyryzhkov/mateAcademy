package com.lesson07.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueues {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

    }
}
