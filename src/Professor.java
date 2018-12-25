public class Professor extends Person {

    Professor(String name, int age, String surname) {
        super(name, age, surname);
    }

    private Group groupProgrammers = new Group();

    void isStudentsAtPlace() { // делаем перекличку студентов
        for (Student student : groupProgrammers.getStudentList()) {
            student.speakOn();
            System.out.println("__________");
        }
        System.out.println("Присутствует: " + Student.getCounterPresence() + " студент(а) на паре" + "\n" +
                "Отсутствует: " + Student.getCounterNoPresence() + " сутдент(а) на паре");
    }

    @Override
    public void speakOn() {
        System.out.println("##############" + "\n" +
                "Доброе утро, меня зовут профессор Дэвид Малан! Мы должны сделать перекличку!" + "\n" +
                "##############");
    }

}
