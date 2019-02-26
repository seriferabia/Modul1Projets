package prWeek11.ex3Interface;

import prWeek11.ex3.WordsForNumbers;

public class Oclock implements TimePeriod {
    @Override
    public Boolean isRightPeriod(Integer minutes) {
        return minutes==0;
    }

    @Override
    public String toWords(Integer hours, Integer minutes) {
        return WordsForNumbers.convertToWord(hours%12)+" o'clock";
    }
}
