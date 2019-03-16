package com.lesson03.usecar;

import java.util.Date;

public class Car {
    private final Date makeDate;
    private String engineType;
    private int maxSpeed;
    private double timeToOneHundredKm;
    private int passengerCapacity;
    private static int passengerInsideRightNow;
    private int currentSpeed;
    private CarWheel[] wheelArray = new CarWheel[4];
    private CarDoor[] doorsArray = new CarDoor[4];


    Car(Date makeDate) {
        this.makeDate = makeDate;
    }

    Car(Date makeDate, String engineType, int maxSpeed, double timeToOneHundredKm, int passengerCapacity, int passengerInsideRightNow, int currentSpeed) {
        this.makeDate = makeDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.timeToOneHundredKm = timeToOneHundredKm;
        this.passengerCapacity = passengerCapacity;
        Car.passengerInsideRightNow = passengerInsideRightNow;
        this.currentSpeed = currentSpeed;
    }

    void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void addOnePassenger() {
        if (passengerInsideRightNow == passengerCapacity) {
            System.out.println("In the car no more space, sorry");
        } else {
            passengerInsideRightNow++;
        }
    }

    void removeOnePassenger() {
        if (passengerInsideRightNow == 0) {
            System.out.println("Car is empty");
        } else {
            passengerInsideRightNow--;
        }
    }

    int removeAllPassengers() {
        return passengerInsideRightNow = 0;
    }

    CarWheel getWheelIndex(int index) {
        if (index < 0 && index > wheelArray.length - 1) {
            System.out.println("This car doesn't have that many wheels");
        }
        return wheelArray[index];
    }

    CarWheel[] removeCarWheels() {
        for (int i = 0; i < this.wheelArray.length; i++) {
            wheelArray[i] = null;
        }
        return wheelArray;
    }

    CarDoor getDoorsIndex(int index) {
        if (index < 0 && index > doorsArray.length - 1) {
            System.out.println("This car doesn't have that many doors");
        }
        return doorsArray[index];
    }

    void createCarWheels() {
        for (int i = 0; i < this.wheelArray.length; i++) {
            this.wheelArray[i] = new CarWheel(1.0);
        }
    }

    void addWheels(int quantityWheels) {
        CarWheel[] carWheels = new CarWheel[this.wheelArray.length + quantityWheels];
        for (int i = 0; i < carWheels.length; i++) {
            if (i > carWheels.length - 1) {
                carWheels[i] = new CarWheel(1.0);
            }
        }
    }

    void createCarDoors() {
        for (int i = 0; i < this.doorsArray.length; i++) {
            this.doorsArray[i] = new CarDoor();
        }
    }

    double minElementArray() {
        int minIndex = 0;
        for (int i = 0; i < this.wheelArray.length; i++) {
            if (this.wheelArray[i].getStateWheel() < this.wheelArray[minIndex].getStateWheel())
            {
                minIndex = i;
            }
        }
        return wheelArray[minIndex].getStateWheel();
    }

    int maximumPossibleSpeed() {
        return Car.passengerInsideRightNow != 0 ? (int) (this.maxSpeed * minElementArray()) : 0;
    }

    @Override
    public String toString() {
        return "Date of produce = " + makeDate +
                ",\n engine type = '" + engineType + '\'' +
                ",\n max speed = " + maxSpeed +
                ",\n time from 0 to 0Km = " + timeToOneHundredKm +
                ",\n passenger capacity =" + passengerCapacity +
                ",\n current speed = " + currentSpeed +
                ",\n maximum possible speed = " + maximumPossibleSpeed();
    }

}
