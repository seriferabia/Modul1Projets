package prWeek11.ex4Interface2;

import java.util.stream.Stream;

public class Deletion implements EditProcess {
    @Override
    public Boolean isRightEdit(String word1, String word2) {
        return word1.length() == word2.length() + 1;
    }

    @Override
    public Boolean isAppliedOnce(String word1, String word2) {
        return Stream.of(word1.split(""))
                .filter(e -> word2.contains(e))
                .filter(e -> isPositionRight(e, word1, word2))
                .count() == word2.length();

    }

    public Boolean isPositionRight(String letter, String word1, String word2) {
        return word1.indexOf(letter) == word2.indexOf(letter) ||
                word1.indexOf(letter) -1 == word2.indexOf(letter);
    }
}
