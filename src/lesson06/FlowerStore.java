package lesson06;

import java.util.ArrayList;
import java.util.stream.Stream;

class FlowerStore {

    private static int cashBox = 0;

    Flower[] sell(int rose, int daisy, int tulip) {
        Stream<Rose> roseStream = Stream.generate(() -> new Rose(100)).limit(rose);
        Stream<Daisy> daisyStream = Stream.generate(() -> new Daisy(70)).limit(daisy);
        Stream<Tulip> tulipStream = Stream.generate(() -> new Tulip(45)).limit(tulip);
        Stream<Flower> firstBouquet = Stream.concat(roseStream, daisyStream);
        Stream<Flower> bouquet = Stream.concat(firstBouquet, tulipStream);

        return bouquet.toArray(Flower[]::new);
    }

    Flower[] sellSequence(int rose, int daisy, int tulip) {
        ArrayList<Flower> flowers = new ArrayList<>();

        int bouquetSize = rose + daisy + tulip;

        for (int i = 0; i < bouquetSize; i++) {
            if (rose > 0) {
                flowers.add(new Rose(100));
                rose--;
                cashBox += 100;
            }
            if (daisy > 0) {
                flowers.add(new Daisy(70));
                daisy--;
                cashBox += 70;
            }
            if (tulip > 0) {
                flowers.add(new Tulip(45));
                tulip--;
                cashBox += 45;
            }
        }

        return flowers.toArray(new Flower[bouquetSize]);
    }

    int getCashBox() {
        return cashBox;
    }
}
