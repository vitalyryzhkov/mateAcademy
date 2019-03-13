package lesson06;

import java.util.Arrays;

public class StoreInit {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();

        System.out.println(Arrays.toString(flowerStore.sell(2, 2, 2)));
        System.out.println(Arrays.toString(flowerStore.sellSequence(5, 1, 2)));
        System.out.println("Sum in cash box: " + flowerStore.getCashBox());
    }
}
