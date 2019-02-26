package prWeek11.ex3Interface;

import java.time.LocalTime;

public class Night implements DayTime {
    @Override
    public Boolean isRightTime(LocalTime time) {
        return time.isAfter(LocalTime.of(20, 0)) && time.isBefore(LocalTime.of(23, 59))
                || time.isAfter(LocalTime.of(0, 0)) && time.isBefore(LocalTime.of(6, 0))
                || time.equals(LocalTime.of(23,59));
    }

    @Override
    public String toWords(Integer hours, Integer minutes) {
        return PartA.toWords(hours, minutes) + " at night";
    }
}
