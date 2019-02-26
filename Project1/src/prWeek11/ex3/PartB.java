package prWeek11.ex3;

import java.time.LocalTime;

public class PartB {
    private TimeWithWords timeWithWords = new TimeWithWords();

    public String toWords(Integer hour, Integer minute) {
        LocalTime time = LocalTime.of(hour, minute);
        if (isInTheMorning(time)) {
            return timeWithWords.toWords(hour, minute) + " in the morning";
        }
        if(isNoon(time)){
            return "noon";
        }
        if (isInTheAfternoon(time)) {
            return timeWithWords.toWords(hour, minute) + " in the afternoon";
        }
        if (isInTheEvening(time)) {
            return timeWithWords.toWords(hour, minute) + " in the evening";
        }
        if (isAtNight(time)) {
            return timeWithWords.toWords(hour, minute) + " at night";
        }
        return "Midnight";
    }

    private Boolean isInTheMorning(LocalTime time) {
        return time.isAfter(LocalTime.of(5, 59)) && time.isBefore(LocalTime.of(12, 0));
    }

    private Boolean isNoon(LocalTime time){
        return time.equals(LocalTime.of(12,0));
    }

    private Boolean isInTheAfternoon(LocalTime time) {
        return time.isAfter(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(17, 1));
    }

    private Boolean isInTheEvening(LocalTime time) {
        return time.isAfter(LocalTime.of(17, 0)) && time.isBefore(LocalTime.of(20, 1));
    }
    private Boolean isAtNight(LocalTime time) {
        return time.isAfter(LocalTime.of(20, 0)) && time.isBefore(LocalTime.of(23, 59))
                || time.isAfter(LocalTime.of(0, 0)) && time.isBefore(LocalTime.of(6, 0))
                || time.equals(LocalTime.of(23,59));
    }

}
