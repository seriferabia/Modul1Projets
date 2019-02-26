package prWeek8.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

    public List<Integer> getEvenNumbers(List<Integer> numbers){
        return getNumber(numbers,e->e%2==0);
    }

    public List<Integer> getOddNumbers(List<Integer> numbers){
        return getNumber(numbers,e->e%2!=0);
    }

    private List<Integer> getNumber(List<Integer> numbers, Predicate<Integer> condition){
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)){
                result.add(number);
            }
        }
        return result;
    }

}
