package prWeek7.ex8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntToNumeralConverter {

    private NumeralIterator numeralIterator = new NumeralIterator();

    public Optional<String> convertToNumeral(Integer number) {
        if (isValid(number)) {
            return getNumeral(number);
        }
        return Optional.empty();
    }

    private Optional<String> getNumeral(Integer number) {
        List<Integer> digitsOfNumber = getDigits(number);
        String result = "";
        result += numeralIterator.addTimes(digitsOfNumber.get(0), "M");
        result += numeralIterator.addTimes(digitsOfNumber.get(1), "C", "D", "M").get();
        result += numeralIterator.addTimes(digitsOfNumber.get(2), "X", "L", "C").get();
        result += numeralIterator.addTimes(digitsOfNumber.get(3), "I", "V", "X").get();
        return Optional.of(result);
    }

    private List<Integer> getDigits(Integer number) {
        List<Integer> digits = new ArrayList<>();
        Integer thousands = number / 1000;
        Integer hundreds = number / 100 % 10;
        Integer tens = number / 10 % 10;
        Integer ones = number % 10;
        digits.addAll(Arrays.asList(thousands, hundreds, tens, ones));
        return digits;
    }

    private Boolean isValid(Integer number) {
        if (number > 3000) {
            System.out.println("Roman numeral converter only supports numbers up to 3000");
            return false;
        }
        if (number == 0) {
            System.out.println("There is no 0 in roman numerals !");
            return false;
        }
        return true;
    }
}
