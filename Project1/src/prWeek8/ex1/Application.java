package prWeek8.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("somewhere","scenario","table","cable","glass","backpack","mouse"));
        System.out.println(words);
        words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);
        words.replaceAll(e->e.toUpperCase());
        System.out.println(words);
        words.removeIf(e->e.length()<6);
        System.out.println(words);
        words.forEach(e->System.out.println(e));
    }
}
