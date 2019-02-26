package prWeek7.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumeralToIntConverter {
    private IntIterator intIterator = new IntIterator();

    public String convertToInteger(String numeral){
        Integer result = 0;
        List<Integer> numbers = getIndividualNumbers(numeral);
        while (numbers.size()>1) {
            Integer first = numbers.get(0);
            Integer second = numbers.get(1);
            if(first<second){
                Integer newFirst = second-first;
                result+=newFirst;
                numbers.remove(0);
            }else {
                result += first;
            }
            numbers.remove(0);
        }
        if(numbers.size()>0){
            result+=numbers.get(0);
        }
        return ""+result;
    }

    private List<Integer> getIndividualNumbers(String numeral) {
        List<String> characters = getNumeralCharcters(numeral);
        List<Integer> digits = new ArrayList<>();
        for (String character : characters) {
            digits.add(intIterator.getIntegerValue(character));
        }
        return digits;
    }

    private List<String> getNumeralCharcters(String numeral) {
        return Stream.of(numeral.split("")).collect(Collectors.toList());
    }
}

