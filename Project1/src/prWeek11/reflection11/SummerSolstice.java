package prWeek11.reflection11;

import java.time.LocalDate;


public class SummerSolstice extends Solstice {
    public String getSolsticeCountdown(LocalDate date) {
        return getCountDown(date, "Summer");
    }


    protected boolean isNextYearsSolstice(LocalDate date) {
        int currentYear = date.getYear();
        int monthValue = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        if (currentYear % 4 == 0) {
            return monthValue > 6 || monthValue == 6 && dayOfMonth > 20;
        }
        return monthValue > 6 || monthValue == 6 && dayOfMonth > 21;
    }

}
