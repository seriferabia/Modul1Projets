package prWeek11.reflection11;

import java.time.LocalDate;

public class WinterSolstice extends Solstice {
    public String getSolsticeCountdown(LocalDate date) {
        return getCountDown(date, "Winter");
    }

    @Override
    protected boolean isNextYearsSolstice(LocalDate date) {
        int currentYear = date.getYear();
        int monthValue = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        if (currentYear % 4 == 3) {
            return monthValue == 12 && dayOfMonth > 22;
        }
        return monthValue == 2 && dayOfMonth > 21;
    }
}
