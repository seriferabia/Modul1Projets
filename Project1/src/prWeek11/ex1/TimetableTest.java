package prWeek11.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimetableTest {
    private LocalDate startDate = LocalDate.parse("2003-03-13");
    private LocalTime startTime = LocalTime.parse("10:00:00");
    private LocalDateTime start = LocalDateTime.of(startDate,startTime);

    @Test
    void main() {
        LocalTime wakingUpTime = startTime;
        Assertions.assertEquals("10:00",wakingUpTime.toString());

        DayOfWeek dayOfTheWeek = start.getDayOfWeek();
        Assertions.assertEquals(DayOfWeek.THURSDAY,dayOfTheWeek);

        LocalTime timeToBePickedUp = startTime.plusMinutes(37).plusSeconds(21);
        Assertions.assertEquals("10:37:21",timeToBePickedUp.toString());



    }
}