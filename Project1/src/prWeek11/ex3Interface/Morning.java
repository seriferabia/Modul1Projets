package prWeek11.ex3Interface;

import java.time.LocalTime;

public class Morning implements DayTime {
    @Override
    public Boolean isRightTime(LocalTime time) {
        return time.isAfter(LocalTime.of(5, 59)) && time.isBefore(LocalTime.of(12, 0));
    }

    @Override
    public String toWords(Integer hours, Integer minutes) {
        return PartA.toWords(hours, minutes) + " in the morning";
    }
}
