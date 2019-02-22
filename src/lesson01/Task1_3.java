package lesson01;

public class Task1_3 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task1_3 task1_3 = new Task1_3();

        System.out.println("Что Вы хотите сделать с числом? \n" +
                "нажмите '1' для возведения числа в квадрат \n" +
                "нажмите '2' для возведения числа в куб \n" +
                "нажмите '3' для возведения числа в степень, необходимую Вам: ");

        int inputNumber = task1.testInt();
        switch (inputNumber) {
            case 1:
                System.out.print("Введите число: ");
                int userNumber1 = task1.testInt();
                System.out.println(task1_3.base2Pow(userNumber1));
                break;
            case 2:
                System.out.print("Введите число: ");
                int userNumber2 = task1.testInt();
                System.out.println(task1_3.base3Pow(userNumber2));
                break;
            case 3:
                System.out.print("Введите число: ");
                int userNumber3 = task1.testInt();
                System.out.print("Введите степень в которую необходимо возвести число: ");
                int userPow = task1.testInt();
                System.out.println(task1_3.baseUserPow(userNumber3, userPow));
                break;
        }
    }

    int base2Pow(int number) {
        return number * number;
    }

    int base3Pow(int number) {
        return number * number * number;
    }

    int baseUserPow(int number1, int number2) {
        int res = 1;
        for (int i = 1; i <= number2; i++) {
            res *= number1;
        }
        return res;
    }
}
