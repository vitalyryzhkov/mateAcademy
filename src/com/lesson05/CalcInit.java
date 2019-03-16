package com.lesson05;

public class CalcInit {
    public static void main(String[] args) throws CustomException {
        RealCalculator rc = new RealCalculator();
        System.out.println(rc.calculator.calculate(2., 3., ')') + "\n" +
                rc.calculator.calculate(2., 3., '*') + "\n" +
                rc.calculator.calculate(2., 3., '/') + "\n" +
                rc.calculator.calculate(2., 3., '-') + "\n" +
                rc.calculator.calculate(2., 3., 'v') + "\n" +
                rc.calculator.calculate(2., 3., '^') + "\n" +
                rc.calculator.calculate(2., 3., '&'));
    }
}
