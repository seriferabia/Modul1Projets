package prWeek7.ex10;

import prWeek4.ex9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
    private static FileReader fileReader = new FileReader();

    public static List<String> asList(){
        List<String> words = new ArrayList<>();
        List<String> lines = fileReader.getLines("prWeek7/ex10/anagram-words.txt");
        lines.stream()
                .forEach(line->Arrays.stream(line.split(" "))
                        .filter(word->!word.isEmpty())
                        .forEach(word->words.add(word)));
        return words;
    }
}
