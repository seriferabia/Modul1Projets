package prWeek9.ex5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {
    private  List<Film> allFilms = new FilmReader().getFilms();

    public List<Film> getHighest3FilmByRating() {
        return allFilms.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getHighest3FilmLongerThan3HoursByRating() {
        return allFilms.stream()
                .filter(e -> e.getRunTime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getMostExpensive4Film() {
        return allFilms.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> getMostExpensive4FilmShorterThan90Min() {
        return allFilms.stream()
                .filter(e -> e.getRunTime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> getFilmsWithCrazyCondition() {
        return allFilms.stream()
                .filter(e -> e.getScore() > 7.0)
                .filter(e -> e.getBudget() > 50000 && e.getBudget()<500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }


}
