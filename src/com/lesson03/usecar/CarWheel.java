package com.lesson03.usecar;

public class CarWheel {
    private double stateWheel;

    CarWheel(double stateWheel) {
        this.stateWheel = stateWheel;
    }

    void newWheel() {
        stateWheel = 1.0;
    }

    public void wipeOffWheel(double wipePercent) {
        stateWheel = stateWheel - (wipePercent / 100 * wipePercent);
    }

    double getStateWheel() {
        return stateWheel;
    }

    @Override
    public String toString() {
        return "state of wheel = " + stateWheel;
    }
}
