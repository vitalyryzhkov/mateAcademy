import java.util.LinkedList;

public class Group {

    private LinkedList<Student> studentLinkedList = new LinkedList<>();
    private Student starosta;


    public void addStudent(Student student) {
        studentLinkedList.add(student);
    }

    public void seeStudents() {
        studentLinkedList.forEach(System.out::println);
    }

    void maxSumSkills() {

        double max = 0.0;

        for (Student element : studentLinkedList) {
            double temp = element.getSumSkills();
            if (temp > max) {
                max = temp;
                starosta = element;
            }

        }
        System.out.println(starosta);
    }
}

