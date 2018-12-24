import java.util.LinkedList;

public class Group {

    LinkedList<Student> studentLinkedList = new LinkedList<>();

    public void addStudent(Student student) {
        studentLinkedList.add(student);

    }

    public void seeStudents() {
        studentLinkedList.forEach(System.out::println);
    }
}

