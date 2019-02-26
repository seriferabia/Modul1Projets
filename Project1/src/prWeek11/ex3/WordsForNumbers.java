package prWeek11.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsForNumbers {

    public static String convertToWord(Integer number){
        if(number<20){
            return getUnits().get(number);
        }
        if(number<100){
            List<Integer> digits = Stream.of(number.toString().split(""))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            return getTens().get(digits.get(0))+" "+getUnits().get(digits.get(1));
        }
        return "Invalid Number";
    }
    private static List<String> getUnits() {
        return new ArrayList<>(Arrays.asList("", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"));
    }

    private static List<String> getTens() {
        return new ArrayList<>(Arrays.asList("", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"));
    }
}
