package prWeek10.reflection10;

import prWeek9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookParser {
    private FileReader fileReader = new FileReader();

    public List<String> getAllWordsFrom(String filePath){
        return fileReader.asStream(filePath)
                .map(String::toLowerCase)
                .map(e->e.replaceAll(","," "))
                .map(e->e.replaceAll(";"," "))
                .map(e->e.replaceAll("'s"," "))
                .map(e->e.replaceAll("‘"," "))
                .map(e->e.replaceAll("’"," "))
                .map(e->e.replaceAll(":"," "))
                .map(e->e.replaceAll("#"," "))
                .map(e->e.replaceAll("-"," "))
                .map(e->e.replaceAll("/"," "))
                .map(e->e.replaceAll("\\."," "))
                .map(e->e.replaceAll("\\["," "))
                .map(e->e.replaceAll("\\]"," "))
                .map(e->e.replaceAll("\\*"," "))
                .map(e->e.replaceAll("\\("," "))
                .map(e->e.replaceAll("\\)"," "))
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .filter(e->!e.isEmpty())
                .collect(Collectors.toList());
    }
}
