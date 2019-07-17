package Sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum sum = new Sum();

    @Test
    void testSum() {
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(3);
        assertEquals(5, sum.sum(input));
    }

    @Test
    void sumWorksWithEmptyList() {
        List<Integer> input = new ArrayList<>();
        assertEquals(0, sum.sum(input));
    }

    @Test
    void sumWorksWithOneElement() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        assertEquals(1, sum.sum(input));
    }

    @Test
    void sumWorksWithMultipleElements() {
        List<Integer> input = new ArrayList<>();
        input.add(2);
        assertEquals(2, sum.sum(input));
    }

    @Test
    void sumWorksWithNull() {
        assertEquals(0, sum.sum(null));
    }
}