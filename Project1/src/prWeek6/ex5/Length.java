package prWeek6.ex5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Length {
    public Integer getLengthOfNumber(Long cardNumber) {
        return Stream.of(cardNumber.toString().split("")).collect(Collectors.toList()).size();
    }
}
