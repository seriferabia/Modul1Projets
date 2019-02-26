package prWeek11.ex2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class MilitaryTime {

    public String toMilitaryTime(String timeIn12HFormat){
        return LocalTime.parse(timeIn12HFormat, DateTimeFormatter.ofPattern("hh:mm:ss a"))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
