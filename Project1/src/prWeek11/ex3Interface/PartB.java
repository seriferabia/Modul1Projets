package prWeek11.ex3Interface;


import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;


public class PartB {
    private static List<DayTime> times = Arrays.asList(new Morning(),new Noon(),new Afternoon(),
            new Evening(), new Night(), new Midnight());

    public static String toWords(Integer hours, Integer minutes){
        LocalTime currentTime = LocalTime.of(hours, minutes);
        for (DayTime time : times) {
            if(time.isRightTime(currentTime)){
                return time.toWords(hours,minutes);
            }
        }
        return "Invalid Time";
    }
}
