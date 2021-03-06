package prWeek11.ex3Interface;

import prWeek11.ex3.WordsForNumbers;

public class HalfPast implements TimePeriod {
    @Override
    public Boolean isRightPeriod(Integer minutes) {
        return minutes == 30;
    }

    @Override
    public String toWords(Integer hours, Integer minutes) {
        return "half past " + WordsForNumbers.convertToWord(hours%12);
    }
}
