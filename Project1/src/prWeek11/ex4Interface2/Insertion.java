package prWeek11.ex4Interface2;

import java.util.stream.Stream;

public class Insertion implements EditProcess {
    @Override
    public Boolean isRightEdit(String word1, String word2) {
        return word2.length()==word1.length()+1;
    }

    @Override
    public Boolean isAppliedOnce(String word1, String word2) {
        return Stream.of(word2.split(""))
                .filter(e->word1.contains(e))
                .filter(e->isPositionRight(e,word1,word2))
                .count()==word1.length();

    }

    public Boolean isPositionRight(String letter,String word1,String word2){
        return word1.indexOf(letter)==word2.indexOf(letter) ||
                word1.indexOf(letter)+1==word2.indexOf(letter);
    }
}
