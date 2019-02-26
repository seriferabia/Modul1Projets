package prWeek11.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitaryTimeTest {
    private MilitaryTime militaryTime = new MilitaryTime();

    @Test
    void toMilitaryTime() {
        String convertedTime = militaryTime.toMilitaryTime("07:05:45 PM");
        Assertions.assertEquals("19:05:45",convertedTime);

        convertedTime=militaryTime.toMilitaryTime("12:00:00 PM");
        Assertions.assertEquals("12:00:00",convertedTime);

        convertedTime=militaryTime.toMilitaryTime("12:00:00 AM");
        Assertions.assertEquals("00:00:00",convertedTime);


    }
}