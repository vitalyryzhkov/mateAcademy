import java.util.Random;

public class Student extends Person implements Presence {
    private double leadership = Math.random(); // параметр "лидерских качеств", необходим для выбора старосты
    private double interpersonalSkills = Math.random(); // параметр "лидерских качеств", необходим для выбора старосты
    private double behavior = Math.random(); // параметр "лидерских качеств", необходим для выбора старосты
    private double academicPerformance = Math.random(); // параметр "лидерских качеств", необходим для выбора старосты
    private double activity = Math.random(); // параметр "лидерских качеств", необходим для выбора старосты
    private double sumSkills; // сумма вышеописанных параметров, так же используется для выбора старосты группы
    private static int counterPresence = 0; // счетчик присутствующих студентов на паре
    private static int counterNoPresence = 0; // счетчик отсутствующих студентов на паре

    public static int getCounterPresence() {
        return counterPresence;
    } // геттеры и сеттеры

    public static int getCounterNoPresence() {
        return counterNoPresence;
    }

    public double getLeadership() {
        return leadership;
    }

    public double getInterpersonalSkills() {
        return interpersonalSkills;
    }

    public double getBehavior() {
        return behavior;
    }

    public double getAcademicPerformance() {
        return academicPerformance;
    }

    public double getActivity() {
        return activity;
    }

    public double getSumSkills() {
        return sumSkills;
    }

    public Student(String name, int age, String surname) {
        super(name, age, surname);
        sumSkills = getLeadership() + getInterpersonalSkills() + getBehavior() + getAcademicPerformance() + getActivity();
    }

    @Override // переопределенный метод "говорить"
    public void speakOn() {
        if (isPresence()) { // используя метод "isPresence" в консоль выводится сообщение о том, присутствует ли конкретный студент на паре или нет
            counterPresence++;
            System.out.println("Студент " + getSurname() + " присутствует на паре");
        } else {
            counterNoPresence++;
            System.out.println("Студент " + getSurname() + " отсутствует на паре");
        }
    }


    @Override
    public String toString() {
        return "Имя и фамилия студента: " +
                getName() +
                " " + getSurname() +
                ", возраст: " + getAge();
    }

    @Override
    public boolean isPresence() {
        return new Random().nextInt(9) % 2 == 0; // благодаря данному методу, мы определяем присутствует
                                                        // ли студент на паре, если рандомное число, в диапазоне от 0
                                                        // до 8(включительно) делится на 2 без остатка, значит студент
                                                        // присутствует, если мы имеем противоположное значение,
                                                        // соответственно - он отсутствует
    }
}
