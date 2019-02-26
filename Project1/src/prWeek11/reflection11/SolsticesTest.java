package prWeek11.reflection11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class SolsticesTest {
    private Solstices solstices = new Solstices();

    @Test
    void testSummerSolsticeCountdown() {
        String countdown = solstices.getSummerSolsticeCountdown(LocalDate.of(2019, Month.FEBRUARY, 01));
        String expected = "The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 140 days).";
        Assertions.assertEquals(expected, countdown);
    }

    @Test
    void testWinterSolsticeCountdown() {
        String countdown = solstices.getWinterSolsticeCountdown(LocalDate.of(2019, Month.FEBRUARY, 01));
        String expected = "The Winter Solstice 2019 is on SUNDAY, DECEMBER 22, 2019 (in 324 days).";
        Assertions.assertEquals(expected, countdown);
    }
}