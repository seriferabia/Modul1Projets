package prWeek9.ex5;



import prWeek9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    public List<Film> getFilms(){
        return new FileReader().asStream("prWeek9/source/films.csv")
                .skip(1)
                .map(line->line.split(";"))
                .map(split->new Film( split[8],split[1]
                    ,Double.parseDouble(split[9])
                    ,Integer.valueOf(split[10])
                    ,Integer.valueOf(split[6])
                    ,Long.parseLong(split[0])
                    ,Long.parseLong(split[5])))
                .collect(Collectors.toList());

    }

//    public List<Film> getFilms(){
//        return fileReader.asStream("prWeek9/source/films.csv")
//                .skip(1)
//                .map(line -> line.split(";"))
//                .map(toFilm())
//                .collect(Collectors.toList());
//    }
//
//    private Function<String[], Film> toFilm(){
//        return split ->new Film(
//                split[8]
//                ,Double.parseDouble(split[9])
//                ,Integer.valueOf(split[10])
//                ,Integer.valueOf(split[6])
//                ,Long.parseLong(split[0])
//                ,Long.parseLong(split[5])
//        );
//    }
}
