package prWeek10.ex5;

import prWeek9.ex5.Film;
import prWeek9.ex5.FilmReader;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieInformation {
    private List<Film> films = new FilmReader().getFilms();

    public Long getNumberOfDistinctMovieGenre(){
        return films.stream()
                .filter(e->!e.getGenre().isEmpty())
                .map(e->e.getGenre())
                .map(e-> getListOfTypes(e))
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public List<String> getListOfTypes(String genre) {
        return Stream.of(genre.split("},"))
                .map(e->e.replaceAll("]",""))
                .map(e->e.replaceAll("\\[",""))
                .map(e->e.replaceAll("\\{",""))
                .map(e->e.replaceAll("}",""))
                .map(e->e.replaceAll("\"",""))
                .map(e->e.replaceAll("id:",""))
                .map(e->e.replaceAll("name:",""))
                .filter(e->!e.isEmpty())
                .map(e->e.split(",")[1])
                .collect(Collectors.toList());

    }
//
//    public Map.Entry<String, Long> getMovieGenreWithHighestRevenue(){
//        Map.Entry<String, Long> entry = films.stream()
//                .collect(Collectors.groupingBy(e->e.getGenre(),Collectors.toList()))
//                .entrySet()
//                .stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .findFirst().get();
//        films.stream()
//                .filter(e->e.getGenre().equals(entry.getKey()))
//                .map(e->e.getTitle()+" with genre "+e.getGenre())
//                .forEach(System.out::println);
//        return entry;
//    }

    public List<String> getMovieGenreWithLongestTime(){
        List<String> genreList = films.stream()
                .collect(Collectors.toMap(Film::getGenre, Film::getRunTime))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e->e.getKey())
                .collect(Collectors.toList());
        films.stream()
                .filter(e->genreList.contains(e.getGenre()))
                .map(e->e.getTitle()+" with genre "+e.getGenre()+" and time "+e.getRunTime())
                .forEach(System.out::println);
        return genreList;


    }
}
