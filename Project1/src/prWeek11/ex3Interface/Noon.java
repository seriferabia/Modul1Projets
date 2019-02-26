package prWeek11.ex3Interface;

import java.time.LocalTime;

public class Noon implements DayTime {
    @Override
    public Boolean isRightTime(LocalTime time) {
        return time.equals(LocalTime.of(12,0));
    }

    @Override
    public String toWords(Integer hours, Integer minutes) {
        return "noon";
    }
}
