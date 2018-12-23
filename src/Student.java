
public class Student {
    private String name;
    private int age;
    private String surname;
    private double liderstvo = Math.random();
    private double communikabelnost = Math.random();
    private long id = System.currentTimeMillis();

    public Student() {

    }


    public Student(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
