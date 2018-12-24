public class Professor extends Person {
    @Override
    public void personVoice() {
        System.out.println("Hello students");
    }

    public Professor(String name, int age, String surname) {
        super(name, age, surname);
    }

}
