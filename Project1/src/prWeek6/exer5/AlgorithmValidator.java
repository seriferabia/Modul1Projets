package prWeek6.exer5;

import java.util.List;

public class AlgorithmValidator {
    private DigitListProvider listProvider = new DigitListProvider();
    private AlgorithmCalculator calculator = new AlgorithmCalculator();

    public Integer getFinalSumOfDigits(String cardNumber) {
        List<Integer> secondToLastDigits = listProvider.getDigitsForMultiplication(cardNumber);
        Integer sumOfSecondToLastDigit = calculator.sumOfMultipliedDigits(secondToLastDigits);
        List<Integer> remainDigits = listProvider.getRemainDigits(cardNumber);
        Integer sumOfRemainDigits = calculator.sumDigitsOfList(remainDigits);
        return sumOfSecondToLastDigit + sumOfRemainDigits;

    }
}
