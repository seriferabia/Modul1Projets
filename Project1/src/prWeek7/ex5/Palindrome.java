package prWeek7.ex5;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {
    public Boolean isPalindrome(String text){
        return Stream.of(text.split(""))
                .filter(e->!e.equals(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()%2==1)
                .collect(Collectors.counting())<=1;
    }

}
