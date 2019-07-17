package Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibo = new Fibonacci();

    @Test
    void fibonacciIndexOne() {
        assertEquals(1, fibo.fibonacci(1));
    }

    @Test
    void fibonacciIndexTwo() {
        assertEquals(1, fibo.fibonacci(2));
    }

    @Test
    void fibonacciIndexThree() {
        assertEquals(2, fibo.fibonacci(3));
    }

    @Test
    void fibonacciIndexNine() {
        assertEquals(34, fibo.fibonacci(9));
    }
    
}