package lesson02.immutable;

public class Immutable {
    public static void main(String[] args) {
        Person person = new Person("Joy", 18);
        System.out.println(person.getName() + " " + person.getAge());
    }
}
