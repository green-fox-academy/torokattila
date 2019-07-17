package Fibonacci;

public class Fibonacci {

    public static int fibonacci(int index) {
        if (index <= 1) {
            return index;
        } return fibonacci(index - 1) + fibonacci(index - 2);
    }


}
