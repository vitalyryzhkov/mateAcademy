package lesson01;

public class Task1_2 {
    public static void main(String[] args) {
        int size = 3;

        for (int i = 1; i < size + 1; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = size; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
            System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
