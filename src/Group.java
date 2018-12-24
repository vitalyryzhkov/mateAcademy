import java.util.LinkedList;

public class Group {

    private LinkedList<Student> studentLinkedList = new LinkedList<>();

    public void addStudent(Student student) {
        studentLinkedList.add(student);
    }

    public void seeStudents() {
        studentLinkedList.forEach(System.out::println);
    }

    void maxSumSkills() {
        double max = 0.0;
        for (int i = 0; i < studentLinkedList.size(); i++) {
            for (int j = 0; j < studentLinkedList.size(); j++) {
                if (studentLinkedList.get(i).getSumSkills() > studentLinkedList.get(j).getSumSkills()) {
                    max = studentLinkedList.get(i).getSumSkills();
                } else max = studentLinkedList.get(j).getSumSkills();
            }
        }
        System.out.println(max);
    }
}

