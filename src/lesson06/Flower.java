package lesson06;

abstract class Flower {
    private int price;

    public Flower() {

    }

    Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
