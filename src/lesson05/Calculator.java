package lesson05;

public interface Calculator<T, E> {
    T calculate(T a, T b, E c);
}
