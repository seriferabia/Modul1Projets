package prWeek7.ex9;

import java.util.ArrayList;
import java.util.List;

public class WordChecker {
    private Dictionary dictionary = new Dictionary();

    public List<String> getMisspelledWords(List<String> words){
        List<String> correctWords = dictionary.getDictionary();
        List<String> misspelledWords = new ArrayList<>();
        for (String word : words) {
            if(!correctWords.contains(word)){
                misspelledWords.add(word);
            }
        }
        System.out.println("Number of misspelled words: " + misspelledWords.size());
        return misspelledWords;
    }
}
