package prWeek7.ex4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Separated {
    public List<Integer> separateToDigits(Integer number){
        return Stream.of(number.toString().split(""))
                .map(e->Integer.valueOf(e))
                .collect(Collectors.toList());
    }
}
