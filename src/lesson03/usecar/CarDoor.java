package lesson03.usecar;

public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;

    CarDoor() {
        this.isDoorOpen = false;
        this.isWindowOpen = false;
    }

    CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    void openDoor() {
        this.isDoorOpen = true;
    }

    void closeDoor() {
        this.isDoorOpen = false;
    }

    void openWindow() {
        this.isWindowOpen = true;
    }

    void closeWindow() {
        this.isWindowOpen = false;
    }

    void closeOrOpenDoor() {
        this.isDoorOpen = !this.isDoorOpen;
    }

    void closeOrOpenWindow() {
        this.isWindowOpen = !this.isWindowOpen;
    }

    @Override
    public String toString() {
        return "is door open? -> " + isDoorOpen +
                "\nis window open? -> " + isWindowOpen;
    }
}
