import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String surname;
    private int id;
    static int counter = 1;

    public Student() {
        id = counter++;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        id = counter++;
    }

//    public void addStudent(Student student) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name at new student: ");
//        student.setName(scanner.next());
//        System.out.println("Enter surname at new student: ");
//        student.setSurname(scanner.next());
//        System.out.println("Enter age at new student: ");
//        student.setAge(scanner.nextInt());
//    }



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

    public int getId() {
        return id;
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
