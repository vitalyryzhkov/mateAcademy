package com.flowers.kiev.service;

import com.flowers.kiev.entity.Daisy;
import com.flowers.kiev.entity.Flower;
import com.flowers.kiev.entity.Rose;
import com.flowers.kiev.entity.Tulip;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FlowerStore {

    private static int cashBox = 0;

    public Flower[] sell(int rose, int daisy, int tulip) {

        Stream<Rose> roseStream = Stream.generate(() -> new Rose()).limit(rose);
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
                Rose rose1 = new Rose(100);
                flowers.add(rose1);
                rose--;
                cashBox += rose1.getPrice();
            }
            if (daisy > 0) {
                Daisy daisy1 = new Daisy(70);
                flowers.add(daisy1);
                daisy--;
                cashBox += daisy1.getPrice();
            }
            if (tulip > 0) {
                Tulip tulip1 = new Tulip(45);
                flowers.add(tulip1);
                tulip--;
                cashBox += tulip1.getPrice();
            }
        }

        return flowers.toArray(new Flower[bouquetSize]);
    }

    public int getCashBox() {
        return cashBox;
    }
}
