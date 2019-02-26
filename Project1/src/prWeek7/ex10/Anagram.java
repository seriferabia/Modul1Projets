package prWeek7.ex10;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    private List<String> words = Words.asList();

    private Merging merging = new Merging();

    public List<String> getAnagramsFor(String word1, String word2) {
        List<String> anagrams = new ArrayList<>();
        String union = merging.combine(word1,word2);
        for (int position1 = 0; position1 <words.size(); position1++) {
            String possibility1 = words.get(position1);
            for (int position2 = 0; position2<words.size();position2++){
                String possibility2 = words.get(position2);
                String possibleAnagram = merging.combine(possibility1,possibility2);
                if (union.equals(possibleAnagram)){
                    anagrams.add(possibility1+" "+possibility2);
                }
            }

        }
        return anagrams;
    }
}
