package prWeek9.ex5;

public class FilmApplication {

    public static void main(String[] args) {
        FilmSummarizer summarizer = new FilmSummarizer();
        System.out.println("Top 3 with highest rating, sorted by rating:");
        System.out.println(summarizer.getHighest3FilmByRating());
        System.out.println(" ");
        System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating:");
        System.out.println(summarizer.getHighest3FilmLongerThan3HoursByRating());
        System.out.println(" ");
        System.out.println("Top 4 most expensive, sorted by budget:");
        System.out.println(summarizer.getMostExpensive4Film());
        System.out.println(" ");
        System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget:");
        System.out.println(summarizer.getMostExpensive4FilmShorterThan90Min());
        System.out.println(" ");
        System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:");
        System.out.println(summarizer.getFilmsWithCrazyCondition());

    }
}
