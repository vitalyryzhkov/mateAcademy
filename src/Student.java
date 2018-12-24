
public class Student extends Person{
    private double liderstvo = Math.random();
    private double communikabelnost = Math.random();
    private double povedenie = Math.random();
    private double ocenki = Math.random();
    private double activity = Math.random();
    private double sumSkills;

//    private long id = System.currentTimeMillis();
    @Override
    public void personVoice() {
        System.out.println("Student surname: " + getSurname() + " is on the pair!");
    }

    public Student() {
    }

    public Student(String name, int age, String surname) {
        super(name, age, surname);
//        liderstvo = Math.random();
//        communikabelnost = Math.random();
//        povedenie = Math.random();
//        ocenki = Math.random();
//        activity = Math.random();
        sumSkills = liderstvo + communikabelnost + povedenie + ocenki + activity;
    }

    public double getSumSkills() {
        return sumSkills;
    }



    @Override
    public String toString() {
        return "Student " +
                getName() +
                " " + getSurname() +
                " age " + getAge() + " sumSkills "
                + getSumSkills();
    }
}
