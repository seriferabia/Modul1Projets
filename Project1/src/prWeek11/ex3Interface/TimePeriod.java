package prWeek11.ex3Interface;

public interface TimePeriod {
    Boolean isRightPeriod(Integer minutes);
    String toWords(Integer hours, Integer minutes);
}
