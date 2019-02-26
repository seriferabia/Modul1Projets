package prWeek11.ex3Interface;

import java.time.LocalTime;

public class Midnight implements DayTime {
    @Override
    public Boolean isRightTime(LocalTime time) {
        return time.equals(LocalTime.of(0,0));
    }

    @Override
    public String toWords(Integer hours, Integer minutes) {
        return "midnight";
    }
}
