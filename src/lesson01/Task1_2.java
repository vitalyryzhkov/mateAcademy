package lesson01;

public class Task1_2 {
    public static void main(String[] args) {
        drawRumb(3);
    }

    private static void drawRumb(int sizeRumbLine) {
        for (int i = 1; i < sizeRumbLine + 1; i++) {
            for (int j = 0; j < sizeRumbLine - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = sizeRumbLine; i > 0; i--) {
            for (int j = 0; j < sizeRumbLine - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
