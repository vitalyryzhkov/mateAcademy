package com.flowers.kiev.service;

import com.flowers.kiev.entity.Daisy;
import com.flowers.kiev.entity.Flower;
import com.flowers.kiev.entity.Rose;
import com.flowers.kiev.entity.Tulip;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FlowerStore {

    private static int cashBox = 0;
    private Rose rose = new Rose(100);
    private Tulip tulip = new Tulip(45);
    private Daisy daisy = new Daisy(70);


    public Flower[] sell(int rose, int daisy, int tulip) {

        Stream<Rose> roseStream = Stream.generate(() -> new Rose(100)).limit(rose);
        Stream<Daisy> daisyStream = Stream.generate(() -> new Daisy(70)).limit(daisy);
        Stream<Tulip> tulipStream = Stream.generate(() -> new Tulip(45)).limit(tulip);
        Stream<Flower> firstBouquet = Stream.concat(roseStream, daisyStream);
        Stream<Flower> bouquet = Stream.concat(firstBouquet, tulipStream);
        return bouquet.toArray(Flower[]::new);
    }

    public Flower[] sellSequence(int rose, int daisy, int tulip) {
        ArrayList<Flower> flowers = new ArrayList<>();

        int bouquetSize = rose + daisy + tulip;
        int maxFlowers = Math.max(rose, daisy > tulip ? daisy : tulip);

        for (int i = 0; i < maxFlowers; i++) {
            if (rose > 0) {
                flowers.add(this.rose);
                rose--;
                cashBox += this.rose.getPrice();
            }
            if (daisy > 0) {
                flowers.add(this.daisy);
                daisy--;
                cashBox += this.daisy.getPrice();
            }
            if (tulip > 0) {
                flowers.add(this.tulip);
                tulip--;
                cashBox += this.tulip.getPrice();
            }
        }

        return flowers.toArray(new Flower[bouquetSize]);
    }

    public int getCashBox() {
        return cashBox;
    }
}
