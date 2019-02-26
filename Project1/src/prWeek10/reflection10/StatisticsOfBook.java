package prWeek10.reflection10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatisticsOfBook {
    private List<String> words = new BookParser().getAllWordsFrom("prWeek10/reflection10/alice.txt");

    public Integer getNumberOfWordsOfBook() {
        return words.size();
    }

    public Long getNumberOfDistinctWords() {
        return words.stream()
                .distinct()
                .count();
    }

    public List<String> getLongestWords() {
        Optional<List<String>> longestWords = words.stream()
                .distinct()
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .map(e -> e.getValue())
                .findFirst();
        if (longestWords.isPresent()) {
            return longestWords.get();
        }
        return new ArrayList<>();

    }

    public List<String> getMostAppearingFiveWords() {
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getValue() + " | " + e.getKey())
                .collect(Collectors.toList());
    }

    public List<String> getMostAppearingFiveLetters() {
        return words.stream()
                .map(e->e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getValue() + " | " + e.getKey())
                .collect(Collectors.toList());
    }

    public long getNumberOfAppearanceOfTheWord(String word) {
        return words.stream()
                .filter(e->e.equalsIgnoreCase(word))
                .count();
    }


}
