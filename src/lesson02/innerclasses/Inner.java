package lesson02.innerclasses;

public class Inner {
    public static void main(String[] args) {
        Inner.InInner newInner = new Inner().new InInner();
        newInner.run();
    }

    class InInner {
        public void run() {
            System.out.println("Inner");
        }
    }
}
