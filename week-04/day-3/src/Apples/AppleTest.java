package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    public void whetherGetApple() {
        Apple myObject = new Apple();
        assertEquals("apple", myObject.getApple());
    }

    @Test
    public void anotherExpectedGetApple() {
        Apple myObject = new Apple();
        assertNotEquals("sausage", myObject.getApple());
    }
}