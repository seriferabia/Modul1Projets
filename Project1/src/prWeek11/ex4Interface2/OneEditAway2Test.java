package prWeek11.ex4Interface2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneEditAway2Test {
    private OneEditAway2 oneEditAway2 = new OneEditAway2();


    @Test
    void testDeletion() {
        Boolean isOneAway = oneEditAway2.isOneEditAway("pale", "ple");
        assertTrue(isOneAway);
    }

    @Test
    void testInsertion() {
        Boolean isOneAway = oneEditAway2.isOneEditAway("pale", "psale");
        Assertions.assertTrue(isOneAway);
    }

    @Test
    void testReplacement() {
        Boolean isOneAway = oneEditAway2.isOneEditAway("pale", "pake");
        Assertions.assertTrue(isOneAway);
    }

    @Test
    void testExtraWords() {
        Boolean isOneAway = oneEditAway2.isOneEditAway("pale", "apels");
        Assertions.assertFalse(isOneAway);

        isOneAway = oneEditAway2.isOneEditAway("pale", "pl");
        Assertions.assertFalse(isOneAway);

        isOneAway = oneEditAway2.isOneEditAway("pale", "paflek");
        Assertions.assertFalse(isOneAway);
    }
}