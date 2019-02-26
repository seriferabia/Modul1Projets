package prWeek10.reflection10;

import java.util.List;

public class Application {
    private static StatisticsOfBook statistics = new StatisticsOfBook();

    public static void main(String[] args) {
        System.out.println("Number of words: "+statistics.getNumberOfWordsOfBook());
        System.out.println("Number of distinct words: "+statistics.getNumberOfDistinctWords());
        System.out.println("Longest words: "+statistics.getLongestWords());
        System.out.println("Most appearing 5 words :");
        statistics.getMostAppearingFiveWords().forEach(System.out::println);
        System.out.println("Most appearing 5 letters :");
        statistics.getMostAppearingFiveLetters().forEach(System.out::println);
        System.out.println("Alice appearances:" +statistics.getNumberOfAppearanceOfTheWord("Alice"));




    }
}
