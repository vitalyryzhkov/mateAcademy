package com.lesson01;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        System.out.print("Enter the score of the first team: ");
        int score1 = task1.testInt();

        System.out.print("Enter the score of the second team: ");
        int score2 = task1.testInt();

        System.out.print("Enter the user score of the first team: ");
        int userScore1 = task1.testInt();

        System.out.print("Enter the user score of the second team: ");
        int userScore2 = task1.testInt();

        System.out.println(task1.testEquals(score1, score2, userScore1, userScore2));
    }

    private int testEquals(int score1, int score2, int userScore1, int userScore2) {
        return (userScore1 == score1) && (userScore2 == score2) ? 2 : (((score1 > score2) && userScore1 > userScore2) ||
                ((score1 < score2) && userScore1 < userScore2) ? 1 : 0);
    }

    int testInt() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Please enter a integer, not a string");
                scanner.next();
                continue;
            }
            if (number < 0) {
                System.out.println("Please enter a number > 0");
                continue;
            }
            break;
        }
        return number;
    }

}

