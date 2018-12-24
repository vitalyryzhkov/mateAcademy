import java.util.LinkedList;

class Group {

    private LinkedList<Student> studentLinkedList = new LinkedList<>();
    private Student starosta;


    void addStudent(Student student) {
        studentLinkedList.add(student);
    }

    void seeStudents() {
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
        System.out.println("Starosta groupe: " + starosta.getName() + " " + starosta.getSurname());
    }
}

