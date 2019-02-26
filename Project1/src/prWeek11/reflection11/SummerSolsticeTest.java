package prWeek11.reflection11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class SummerSolsticeTest {
    private Solstice summerSolstice = new SummerSolstice();

    @Test
    void testSummerCountdown() {
        LocalDate solstice = summerSolstice.getSolsticeDate(LocalDate.of(2019, Month.FEBRUARY, 01), "Summer");
        LocalDate expected = LocalDate.of(2019, Month.JUNE, 21);
        Assertions.assertEquals(expected, solstice);

        solstice = summerSolstice.getSolsticeDate(LocalDate.of(2019, Month.OCTOBER, 01), "Summer");
        expected = LocalDate.of(2020, Month.JUNE, 20);
        Assertions.assertEquals(expected, solstice);

        solstice = summerSolstice.getSolsticeDate(LocalDate.of(2022, Month.FEBRUARY, 01), "Summer");
        expected = LocalDate.of(2022, Month.JUNE, 21);
        Assertions.assertEquals(expected, solstice);

        solstice = summerSolstice.getSolsticeDate(LocalDate.of(2023, Month.FEBRUARY, 01), "Summer");
        expected = LocalDate.of(2023, Month.JUNE, 21);
        Assertions.assertEquals(expected, solstice);


    }
}