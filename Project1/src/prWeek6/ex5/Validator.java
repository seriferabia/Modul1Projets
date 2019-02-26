package prWeek6.ex5;

import java.util.List;

public class Validator {
    private DigitListProvider listProvider = new DigitListProvider();
    private AlgorithmCalculator calculator = new AlgorithmCalculator();

    public Integer getFinalSumOfDigits(Long cardNumber) {
        List<Integer> allDigits = listProvider.getAllDigits(cardNumber);
        List<Integer> secondToLastDigits = listProvider.getDigitsForMultiplication(cardNumber);
        Integer sumOfSecondToLastDigit = calculator.sumOfMultipliedDigits(secondToLastDigits);
        List<Integer> remainDigits = listProvider.getRemainDigits(allDigits, secondToLastDigits);
        Integer sumOfRemainDigits = calculator.sumDigitsOfList(remainDigits);
        Integer total = sumOfSecondToLastDigit + sumOfRemainDigits;
        return total;
    }
}
