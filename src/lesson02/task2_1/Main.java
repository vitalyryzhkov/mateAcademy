package lesson02.task2_1;

public class Main {
    public static void main(String[] args) {
        City city = new City.Builder()
                .withName("Kyiv")
                .withPopulation(3_000_000)
                .build();
        System.out.println(city);
    }
}
