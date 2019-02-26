package prWeek11.reflection11;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public abstract class Solstice {
    public String getCountDown(LocalDate date, String type) {
        LocalDate solsticeDate = getSolsticeDate(date, type);
        return getString(date, solsticeDate, type);
    }

    public LocalDate getSolsticeDate(LocalDate date, String type) {
        int year = date.getYear();
        if (isNextYearsSolstice(date)) {
            year++;
        }
        if (type.equalsIgnoreCase("Summer")) {
            if (year % 4 == 0) {
                return LocalDate.of(year, Month.JUNE, 20);
            }
            return LocalDate.of(year, Month.JUNE, 21);
        }
        if (year % 4 == 3) {
            return LocalDate.of(year, Month.DECEMBER, 22);
        }
        return LocalDate.of(year, Month.DECEMBER, 21);

    }

    protected abstract boolean isNextYearsSolstice(LocalDate date);

    public String getString(LocalDate currentDate, LocalDate dateOfSolstice, String type) {
        long days = currentDate.until(dateOfSolstice, ChronoUnit.DAYS);
        return "The " + type + " Solstice " + currentDate.getYear() + " is on " + dateOfSolstice.getDayOfWeek() + ", "
                + dateOfSolstice.getMonth() + " " + dateOfSolstice.getDayOfMonth() + ", " + dateOfSolstice.getYear() +
                " (in " + days + " days).";
    }
}
