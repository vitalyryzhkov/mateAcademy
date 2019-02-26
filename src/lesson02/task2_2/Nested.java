package lesson02.task2_2;

public class Nested {
    public static void main(String[] args) {
        Nested.InNested newNested = new Nested.InNested();
        newNested.run();
    }

    static class InNested {
        public void run() {
            System.out.println("Nested");
        }
    }

}
