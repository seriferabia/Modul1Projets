package prWeek3.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCorrectorTest {

    NumberCorrector numberCorrector = new NumberCorrector();

    @Test
    void testCorrect() {
        Double weight = 56.7;
        Integer expected = 56;
        Integer result = numberCorrector.correct(weight);
        Assertions.assertEquals(expected, result);
    }
}