package prWeek10.ex4;

public class GOTApplication {
    public static void main(String[] args) {
        GOTBookStatistic statistic = new GOTBookStatistic();
        System.out.println(statistic.getTwoAllegiancesThatHaveTheBiggestDeathCount());
        System.out.println(statistic.deathBookOfAllegiance("Stark"));
        System.out.println(statistic.getDeathNumberFromAllegiance("Stark"));
        System.out.println(statistic.isThereAliveCharacter());
    }
}
