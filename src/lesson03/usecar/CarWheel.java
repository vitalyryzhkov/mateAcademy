package lesson03.usecar;

public class CarWheel {
    private double stateWheel;

    CarWheel(double stateWheel) {
        this.stateWheel = stateWheel;
    }

    public void newWheel() {
        this.stateWheel = 1.0;
    }

    public void wipeOffWheel(double wipePercent) {
        this.stateWheel = stateWheel - (wipePercent / 100 * wipePercent);
    }

    public double getStateWheel() {
        return stateWheel;
    }

    @Override
    public String toString() {
        return "state of wheel = " + stateWheel;
    }
}
