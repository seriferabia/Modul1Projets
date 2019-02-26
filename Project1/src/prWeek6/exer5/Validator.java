package prWeek6.exer5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Validator {

    public List<Integer> possibilities;

    public Validator(Integer... possibilities) {
        this.possibilities = Stream.of(possibilities).collect(Collectors.toList());
    }

    public abstract Boolean isValid(String cardNumber);
}
