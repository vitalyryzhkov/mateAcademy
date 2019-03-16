package com.lesson02.innerclasses;

public class Anonymous {
    public static void main(String[] args) {
        Name newName = () -> System.out.println("Name is " + Name.name);
        newName.getName();
    }

    interface Name {
        String name = "Anonymous";
        void getName();
    }
}
