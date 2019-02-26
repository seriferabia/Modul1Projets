package prWeek7.ex9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WordCounter {
    private FileReader fileReader = new FileReader();

//    public Long countWordsOf(String filePath){
//        Long numberOfWords = Long.valueOf(0);
//        List<String> lines = fileReader.getLines(filePath);
//        for (String line : lines) {
//            numberOfWords+=line.split(" ").length;
//        }
//        return numberOfWords;
//    }
    public List<String> getAllWords(String filePath){
        List<String> words = new ArrayList<>();
        List<String> lines = fileReader.getLines(filePath);
        for (String line : lines) {
            words.addAll(Arrays.asList(line.split(" ")));
        }
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            word=word.replaceAll("[,;.:]","");
            if(word.startsWith("'")) word.replaceAll("'","");
        }
        System.out.println("Number of words checked: "+newWords.size());
        return newWords;
    }
}
