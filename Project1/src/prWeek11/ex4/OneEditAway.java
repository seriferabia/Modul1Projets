package prWeek11.ex4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneEditAway {
    public Boolean isOneEditAway(String word1, String word2) {
        List<String> letters1 = getLetters(word1);
        List<String> letters2 = getLetters(word2);
        int difference = letters1.size() - letters2.size();
        if (Math.abs(difference) > 1) {
            return false;
        }
        return letters1.stream()
                    .filter(e -> !letters2.contains(e))
                    .count() < 2;
    }

    private static List<String> getLetters(String word) {
        return Stream.of(word.split("")).collect(Collectors.toList());
    }
}
