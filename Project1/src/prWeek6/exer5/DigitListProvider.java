package prWeek6.exer5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DigitListProvider {
    public List<Integer> getAllDigits(String cardNumber) {
        return Stream.of(cardNumber.split("")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());
    }

    public List<Integer> getDigitsForMultiplication(String cardNumber) {
        List<Integer> allDigits = getAllDigits(cardNumber);
        int size = allDigits.size();
        List<Integer> digitsforMultiplication = new ArrayList<>();
        for (int position = size - 2; position >= 0; position -= 2) {
            digitsforMultiplication.add(allDigits.get(position));
        }
        return digitsforMultiplication;
    }

    public List<Integer> getRemainDigits(String cardNumber) {
        List<Integer> allDigits = getAllDigits(cardNumber);
        int size = allDigits.size();
        List<Integer> remainDigits = new ArrayList<>();
        for (int position = size - 1; position >= 0; position -= 2) {
            remainDigits.add(allDigits.get(position));
        }
        return remainDigits;
    }
}
