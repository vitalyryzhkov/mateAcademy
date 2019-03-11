package lesson05;

@FunctionalInterface

public interface Calculator<T, E> {
    T calculate(T a, T b, E c) throws CustomException;
}
