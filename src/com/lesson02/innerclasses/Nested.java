package com.lesson02.innerclasses;

public class Nested {
    public static void main(String[] args) {
        Nested.InNested newNested = new Nested.InNested();
        newNested.run();
    }

    static class InNested {
        public void run() {
            System.out.println("Nested");
        }
    }

}
