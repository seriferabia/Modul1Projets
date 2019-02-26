package prWeek7.ex1;

import java.util.List;

public class MoneyCalculator {

    public Integer accumulate(List<Integer> payments){
        return payments.stream().mapToInt(i -> i.intValue()).sum();
        //return payments.stream().collect(Collectors.summingInt(Integer::intValue));
    }
}
