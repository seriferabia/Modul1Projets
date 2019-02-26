package prWeek7.ex9;

import java.util.List;

public class Application {
    private static WordChecker checker = new WordChecker();
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.getAllWords("prWeek7/ex9/book/dorian-gray.txt");
        List<String> misspelledWords = checker.getMisspelledWords(words);
        System.out.println(misspelledWords);

    }
}
