package prWeek11.reflection11;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WinterSolsticeTest {
    private Solstice winterSolstice = new WinterSolstice();

    @Test
    void testWinterCountdown() {
        LocalDate solstice = winterSolstice.getSolsticeDate(LocalDate.of(2019, Month.FEBRUARY, 01), "Winter");
        LocalDate expected = LocalDate.of(2019, Month.DECEMBER, 22);
        assertEquals(expected, solstice);

        solstice = winterSolstice.getSolsticeDate(LocalDate.of(2019, Month.DECEMBER, 23), "Winter");
        expected = LocalDate.of(2020, Month.DECEMBER, 21);
        assertEquals(expected, solstice);

        solstice = winterSolstice.getSolsticeDate(LocalDate.of(2022, Month.FEBRUARY, 01), "Winter");
        expected = LocalDate.of(2022, Month.DECEMBER, 21);
        assertEquals(expected, solstice);

        solstice = winterSolstice.getSolsticeDate(LocalDate.of(2023, Month.FEBRUARY, 01), "Winter");
        expected = LocalDate.of(2023, Month.DECEMBER, 22);
        assertEquals(expected, solstice);
    }
}