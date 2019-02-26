package prWeek7.ex10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Merging {
    public String combine(String word1,String word2){
        String combination = word1+word2;
        return Arrays.stream(combination.split(""))
                .sorted()
                .collect(Collectors.joining(""));
    }

}