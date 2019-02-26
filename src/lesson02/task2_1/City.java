package lesson02.task2_1;

import test.Person;

public class City {
    private String name;
    private int population;

    private City() {
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public static Builder newBuilder() {
        return new City().new Builder();
    }

    public class Builder {
//        private City newCity;

        private Builder() {
//            newCity = new City();
        }

        public Builder withName(String name) {
            City.this.name = name;
            return this;
        }

        public Builder withPopulation(int population) {
            City.this.population = population;
            return this;
        }

        public City build() {
            City city = new City();
            city.name = City.this.name;
            city.population = City.this.population;
            return city;
        }
    }

    @Override
    public String toString() {
        return "City name='" + name + '\'' +
                ", city population=" + population;
    }
}
