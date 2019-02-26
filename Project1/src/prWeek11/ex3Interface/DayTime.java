package prWeek11.ex3Interface;

import java.time.LocalTime;

public interface DayTime {
    Boolean isRightTime(LocalTime time);
    String toWords(Integer hours, Integer minutes);
}
