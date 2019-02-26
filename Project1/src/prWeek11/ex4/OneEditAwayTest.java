package prWeek11.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

class OneEditAwayTest {
    private OneEditAway oneEditAway = new OneEditAway();

    @Test
    void testIsOneEditAway() {
        Instant start = Instant.now();
        Boolean isOneAway = this.oneEditAway.isOneEditAway("pale", "ple");
        Assertions.assertTrue(isOneAway);
        Instant end = Instant.now();
        System.out.println("Time duration for the test1: " + Duration.between(start, end).toMillis());

        Instant start2 = Instant.now();
        isOneAway = this.oneEditAway.isOneEditAway("pale", "pales");
        Assertions.assertTrue(isOneAway);
        Instant end2 = Instant.now();
        System.out.println("Time duration for the test2: " + Duration.between(start2, end2).toMillis());

        Instant start3 = Instant.now();
        isOneAway = this.oneEditAway.isOneEditAway("pale", "bale");
        Assertions.assertTrue(isOneAway);
        Instant end3 = Instant.now();
        System.out.println("Time duration for the test3: " + Duration.between(start3, end3).toMillis());

        Instant start4 = Instant.now();
        isOneAway = this.oneEditAway.isOneEditAway("pale", "bake");
        Assertions.assertFalse(isOneAway);
        Instant end4 = Instant.now();
        System.out.println("Time duration for the test4: " + Duration.between(start4, end4).toMillis());
    }
}