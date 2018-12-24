import java.util.Collections;
import java.util.LinkedList;

public class Group {

    public Group() {
    }

    LinkedList<Student> linkedList = new LinkedList<>();

    public void addStudent(Student student) {
        linkedList.add(student);
        }

    public void seeStudents() {
        linkedList.forEach(System.out::println);
    }

    public void maxSkillsStudent(LinkedList linkedList) {
        Collections.max(linkedList);
    }


}