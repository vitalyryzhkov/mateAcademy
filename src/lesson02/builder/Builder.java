package lesson02.builder;

public class Builder {
    public static void main(String[] args) {
        City city = City.newBuilder()
                .withName("Kyiv")
                .withPopulation(3_000_000)
                .build();
        System.out.println(city);
    }
}
