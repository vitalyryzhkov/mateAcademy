package lesson05;

class CustomException extends Exception {
    CustomException() {
        super("There is no such operator");
    }
}
