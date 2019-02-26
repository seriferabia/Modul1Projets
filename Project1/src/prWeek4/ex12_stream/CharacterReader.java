package prWeek4.ex12_stream;


import prWeek4.ex9.FileReader;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toMap;

public class CharacterReader {
    private FileReader reader = new FileReader();

    public List<Character> getCharacters(String filePath){
        List<String> lines = reader.getLines(filePath);
        lines.remove(0);
        return lines.stream().map(e->toCharacter(e)).collect(Collectors.toList());
    }
    public Character toCharacter(String line){
        String[] split = line.split(";");
        String name = split[0];
        String bookOfDeath = split[3];
        String gender = split[6];
        return new Character(name, bookOfDeath,gender);
    }
    public List<Character> getDeadCharacters(List<Character> characters){
        return characters.stream()
                .filter(e->!e.getBookOfDeath().isEmpty())
                .collect(Collectors.toList());
    }
    public List<Character> getDeadMen(List<Character> deadCharacters){
        return deadCharacters.stream()
                .filter(e->e.getGender().equals("1"))
                .collect(Collectors.toList());
    }
    public List<Character> getDeadWomen(List<Character> deadCharacters){
        return deadCharacters.stream()
                .filter(e->e.getGender().equals("0"))
                .collect(Collectors.toList());
    }
    public Map<String, Long> getNumberOfDeathInEachBook(List<Character> deadCharacters){
        List<String> books = deadCharacters.stream()
              .map(e->e.getBookOfDeath()).collect(Collectors.toList());
        return books.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    public Map.Entry<String,Long> getMostDeathfulBook(Map<String,Long> books){
         Map<String,Long> sortedBooks = books.entrySet().stream()
                 .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
         return (Map.Entry<String, Long>) new ArrayList(sortedBooks.entrySet()).get(0);
    }
    public List<Character> getCharactersFormMostDeatfulBook(List<Character> deadCharacters){
        Map<String, Long> numberOfDeathInEachBook = getNumberOfDeathInEachBook(deadCharacters);
        Map.Entry<String, Long> mostDeathfulBook = getMostDeathfulBook(numberOfDeathInEachBook);
        return deadCharacters.stream()
                .filter( e-> e.getBookOfDeath().equals(mostDeathfulBook.getKey()))
                .collect(Collectors.toList());
    }
}
