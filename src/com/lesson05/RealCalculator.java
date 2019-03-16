package com.lesson05;

class RealCalculator {
    Calculator<Double, Character> calculator = (Double a, Double b, Character c) ->

            c == ('+') ? (a + b) :
                    c == ('*') ? a * b :
                            c == ('/') ? a / b :
                                    c == ('-') ? (a - b) :
                                            c == ('v') ? Math.pow(a, 1 / b) :
                                                    c == ('^') ? Math.pow(a, b) :
                                                            c == ('&') ? Math.pow((a + b) / a + 117, b) : customException();

    private static double customException() throws CustomException {
        throw new CustomException();
    }
}

