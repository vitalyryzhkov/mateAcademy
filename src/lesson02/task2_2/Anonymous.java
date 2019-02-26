package lesson02.task2_2;

public class Anonymous {
    public static void main(String[] args) {
        Name newName = () -> System.out.println("Name is " + Name.name);
        newName.getName();
    }

    interface Name {
        String name = "Anonymous";
        void getName();
    }
}
