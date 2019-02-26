package prWeek8.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class KeywordFinder {
    public List<String> findElegant(String sentence){
        return findWord(sentence,e->e.startsWith("ele"));
    }

    public List<String> findPlayful(String sentence){
        return findWord(sentence,e->e.endsWith("ful"));
    }

    private List<String> findWord(String sentence, Predicate<String> condition){
        return Arrays.stream(sentence.split(" "))
                .filter(word->condition.test(word))
                .collect(Collectors.toList());
    }
}
