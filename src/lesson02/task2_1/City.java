package lesson02.task2_1;

import test.Person;

public class City {
    private String name;
    private int population;

    public City() {
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public static class Builder {
        private City newCity;

        public Builder() {
            newCity = new City();
        }

        public Builder withName(String name) {
            newCity.name = name;
            return this;
        }

        public Builder withPopulation(int population) {
            newCity.population = population;
            return this;
        }

        public City build() {
            return newCity;
        }
    }

    @Override
    public String toString() {
        return "City name='" + name + '\'' +
                ", city population=" + population;
    }
}
