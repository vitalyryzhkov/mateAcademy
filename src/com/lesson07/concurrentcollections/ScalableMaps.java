package com.lesson07.concurrentcollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ScalableMaps {

    private static Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        concurrentHashMap.putIfAbsent("Ivan", "Ivanov");
        concurrentHashMap.putIfAbsent("Petr", "Petrov");
        concurrentHashMap.putIfAbsent("Sidr", "Sidorov");

        new Thread(() -> {
            concurrentHashMap.putIfAbsent("Nikki", "Nikson");
        }).start();
        new Thread(() -> {
            concurrentHashMap.forEach((key, value) -> System.out.println(key + " " + value));
        }).start();
    }
}
