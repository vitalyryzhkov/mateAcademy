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
}
