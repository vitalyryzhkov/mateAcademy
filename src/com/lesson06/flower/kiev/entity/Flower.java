package com.lesson06.flower.kiev.entity;

public abstract class Flower {
    private int price;

    public Flower() {

    }

    public Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
