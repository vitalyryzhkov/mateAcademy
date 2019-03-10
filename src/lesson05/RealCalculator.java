package lesson05;

public class RealCalculator {

    public static void main(String[] args) {
        Calculator<Double, Character> calculator = (Double a, Double b, Character c) ->
                c == ('+') ? (a + b) :
                        c == ('*') ? a * b :
                                c == ('/') ? a / b :
                                        c == ('-') ? (a - b) :
                                                c == ('v') ? Math.pow(a, 1 / b) :
                                                        c == ('^') ? Math.pow(a, b) :
                                                                c == ('&') ? Math.pow((a + b) / a + 117, b) : 0.0d;

        System.out.println(calculator.calculate(2., 3., '+') + "\n" +
                calculator.calculate(2., 3., '+') + "\n" +
                calculator.calculate(2., 3., '*') + "\n" +
                calculator.calculate(2., 3., '/') + "\n" +
                calculator.calculate(2., 3., '-') + "\n" +
                calculator.calculate(2., 3., 'v') + "\n" +
                calculator.calculate(2., 3., '^') + "\n" +
                calculator.calculate(2., 3., '&'));
    }
}
