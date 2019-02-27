package test;

import java.util.LinkedList;

public abstract class Person {
    private String name; //имя объекта
    private int age; // возраст объекта
    private String surname; // фамилия объекта


    public abstract void speakOn(); // абстрактный метод "говорить"

    public Person() {
    } // конструктор класса "Person" без параметров(конструктор по умолчанию)

    public Person(String name, int age, String surname) { // конструктор класса "Person" с параметрами "имя", "возраст" и "фамилия"
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    } // геттеры и сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    static class Group {

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

    public static class Main {
        public static void main(String[] args) {

            Group groupProgrammers = new Group(); //создаем экземпляр класса "Person.Group"

            Professor professorMalan = new Professor("David", 49, "Malan"); //создаем экземпляр класса "testTask.Professor"

            groupProgrammers.addStudent(new Student("Ivan", 19, "Ivanov")); //добавляем нового студента
            groupProgrammers.addStudent(new Student("Konstantin", 22, "Shustrov"));
            groupProgrammers.addStudent(new Student("Alex", 23, "Shelby"));

            groupProgrammers.viewStudents(); //выводим в консоль всех созданных студентов студентов

            groupProgrammers.whoIsHeadman(); //определяем и выводим в консоль имя старосты

            professorMalan.speakOn(); //обращение профессора

            professorMalan.isStudentsAtPlace(); //перекличка студентов


        }

    }

//    public abstract static class Person {
//        private String name; //имя объекта
//        private int age; // возраст объекта
//        private String surname; // фамилия объекта
//
//
//        public abstract void speakOn(); // абстрактный метод "говорить"
//
//        public Person() {
//        } // конструктор класса "Person.Person" без параметров(конструктор по умолчанию)
//
//        public Person(String name, int age, String surname) { // конструктор класса "Person.Person" с параметрами "имя", "возраст" и "фамилия"
//            this.name = name;
//            this.age = age;
//            this.surname = surname;
//        }
//
//        public String getName() {
//            return name;
//        } // геттеры и сеттеры
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public String getSurname() {
//            return surname;
//        }
//
//        public void setSurname(String surname) {
//            this.surname = surname;
//        }
//    }
}
