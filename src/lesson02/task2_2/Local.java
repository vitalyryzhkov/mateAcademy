package lesson02.task2_2;

public class Local {
    public static void main(String[] args) {
        Local local = new Local();
        local.testLocal();
    }

    public void testLocal() {
        class TestLocalClass {
            public void run () {
                System.out.println("Local");
            }
        }
        TestLocalClass testLocalClass = new TestLocalClass();
        testLocalClass.run();
    }
}
