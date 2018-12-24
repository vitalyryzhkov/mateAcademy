import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Group group = new Group();
        group.addStudent(new Student("Ivan", 19, "Ivanov"));
        group.addStudent(new Student("Konstantin", 22, "Shustrov"));
        group.addStudent(new Student("Alex", 23, "Shelby"));

        group.seeStudents();

    }

}
