package lesson03.usecar;

public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;


    CarDoor() {
        isDoorOpen = false;
        isWindowOpen = false;
    }

    CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    void openDoor() {
        isDoorOpen = true;
    }

    void closeDoor() {
        isDoorOpen = false;
    }

    void openWindow() {
        isWindowOpen = true;
    }

    void closeWindow() {
        isWindowOpen = false;
    }

    void closeOrOpenDoor() {
        isDoorOpen = !isDoorOpen;
    }

    void closeOrOpenWindow() {
        isWindowOpen = !isWindowOpen;
    }

    @Override
    public String toString() {
        return "is door open? -> " + isDoorOpen +
                "\nis window open? -> " + isWindowOpen;
    }
}
