package prWeek11.ex3Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartA {
    private static List<TimePeriod> periods = new ArrayList<>(
            Arrays.asList(new Oclock(),new HalfPast(),new PastHour(), new ToHour()));

    public static String toWords(Integer hours, Integer minutes){
        for (TimePeriod period : periods) {
            if(period.isRightPeriod(minutes)){
                return period.toWords(hours,minutes);
            }
        }
        return "Invalid Time";
    }
}
