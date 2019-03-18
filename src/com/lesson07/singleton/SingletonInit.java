package com.lesson07.singleton;

class SingletonInit {
    private static SingletonInit instance;
    private String value;

    private SingletonInit(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    String getValue() {
        return value;
    }

    static SingletonInit getInstance(String value) {
        if (instance == null) {
            instance = new SingletonInit(value);
        }
        return instance;
    }
}
