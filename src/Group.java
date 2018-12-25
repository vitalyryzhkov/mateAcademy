import java.util.LinkedList;

class Group {

    private static LinkedList<Student> studentList = new LinkedList<>(); // создаем список студентов
    private Student headman; // экземпляр студентра, которому будет присвоено значение старосты

    LinkedList<Student> getStudentList() {
        return studentList;
    }

    void addStudent(Student student) {
        getStudentList().add(student);
    } // метод, для добавления студентов в список

    void viewStudents() { // вывод студентов в консоль
        getStudentList().forEach(System.out::println);
    }


    void whoIsHeadman() { // выбор старосты, происходит путем определения студента с наибольшим значением суммы всех "скилов"
        double max = 0.0;

        for (Student student : getStudentList()) {
            double temp = student.getSumSkills();
            if (temp > max) {
                max = temp;
                headman = student;
            }
        }
        System.out.println("!-----!" + "\n" +
                headman.getName() + " " + headman.getSurname() + " выбран старостой!" + "\n" +
                "!-----!");
    }
}

