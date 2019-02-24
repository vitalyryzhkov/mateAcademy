package lesson01;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to know factorial: ");
        System.out.println(factorial(scanner.nextInt()));

        System.out.println("Enter number to calculate Fibonacci sequence: ");
        System.out.println(fibonacci(scanner.nextInt()));
    }

    private static long factorial(int number) {
        if (number == 1 || number == 0) return 1;

        return number * factorial(number - 1);
    }

    private static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
