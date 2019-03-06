package lesson03.usecar;

import java.util.Date;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car(new Date(), "electrical", 199, 3.2, 5, 3, 55);
        car.createCarWheels();
        System.out.println(car);
        car.getWheelIndex(1).newWheel();
    }
}

