package prWeek7.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedTest {
    private Separated separated = new Separated();

    @Test
    void testSeparateToDigits() {
        List<Integer> expected = Arrays.asList(4,6,5,3);
        List<Integer> digits = separated.separateToDigits(4653);
        Assertions.assertEquals(expected,digits);
    }
}