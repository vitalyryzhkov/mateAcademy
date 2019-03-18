package com.lesson07.singleton;

import java.lang.reflect.Constructor;

public class BrokeSingleton {

    public static void main(String[] args) {
        SingletonInit instanceOne = SingletonInit.getInstance("singleton");
        SingletonInit instanceTwo = null;
        try {
            Constructor[] constructors = SingletonInit.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (SingletonInit) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.getValue());
        System.out.println(instanceTwo.getValue());
    }
}
