package lesson01;

public class Task1_3 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task1_3 task1_3 = new Task1_3();

        System.out.println("What do you want to do with number? \n" +
                "press '1' to make number 2power \n" +
                "press '2' to make number 3power \n" +
                "press '3' to make number power that you want: ");

        int inputNumber = task1.testInt();
        switch (inputNumber) {
            case 1:
                System.out.print("Enter number: ");
                int userNumber1 = task1.testInt();
                System.out.println(task1_3.base2Pow(userNumber1));
                break;
            case 2:
                System.out.print("Enter number: ");
                int userNumber2 = task1.testInt();
                System.out.println(task1_3.base3Pow(userNumber2));
                break;
            case 3:
                System.out.print("Enter number: ");
                int userNumber3 = task1.testInt();
                System.out.print("Enter power: ");
                int userPow = task1.testInt();
                System.out.println(task1_3.baseUserPow(userNumber3, userPow));
                break;
        }
    }

    private int base2Pow(int number) {
        return number * number;
    }

    private int base3Pow(int number) {
        return number * number * number;
    }

    private int baseUserPow(int number1, int number2) {
        int res = 1;
        for (int i = 1; i <= number2; i++) {
            res *= number1;
        }
        return res;
    }
}
