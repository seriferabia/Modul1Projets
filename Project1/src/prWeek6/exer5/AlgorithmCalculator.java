package prWeek6.exer5;

import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmCalculator {

    public Integer sumOfMultipliedDigits(List<Integer> digitsForMultiplication) {
        Integer total = 0;
        List<Integer> multipliedDigits = digitsForMultiplication.stream().map(e -> e * 2).collect(Collectors.toList());
        for (Integer digit : multipliedDigits) {
            if (digit > 9) {
                digit = digit - 9;
            }
            total += digit;
        }
        return total;
    }

    public Integer sumDigitsOfList(List<Integer> multipliedDigits) {
        Integer sum = 0;
        for (Integer number : multipliedDigits) {
            sum += number;
        }
        return sum;
    }
}
