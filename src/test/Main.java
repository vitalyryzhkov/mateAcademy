/*
Программа "Первокурсники":
Программа состоит из 6 классов:
"SortUtil" - основной класс, запускающий программу
"Person" - абстрактный класс, от которого наследуются класс "Student" и "Professor"
"Student" - класс, в котором описаны все поля, необходимые для "создания" нового студента(наследуется от "Person" и
имплементируется от "Presence")
"Professor" - класс, в котором описаны все поля, необходимые для "создания" нового профессора(наследуется от "Person")
"Group" - класс, в котором "создаются" студенты, так же происходит выбор старосты
"Presence" - интерфейс, класс "Student" переопределяет его метод, предназначенный для выбора присутствия, либо же,
отсутствия студента на паре
*/

package test;

public class Main {
    public static void main(String[] args) {

        Group groupProgrammers = new Group(); //создаем экземпляр класса "Group"

        Professor professorMalan = new Professor("David", 49, "Malan"); //создаем экземпляр класса "Professor"

        groupProgrammers.addStudent(new Student("Ivan", 19, "Ivanov")); //добавляем нового студента
        groupProgrammers.addStudent(new Student("Konstantin", 22, "Shustrov"));
        groupProgrammers.addStudent(new Student("Alex", 23, "Shelby"));

        groupProgrammers.viewStudents(); //выводим в консоль всех созданных студентов студентов

        groupProgrammers.whoIsHeadman(); //определяем и выводим в консоль имя старосты

        professorMalan.speakOn(); //обращение профессора

        professorMalan.isStudentsAtPlace(); //перекличка студентов


    }

}
