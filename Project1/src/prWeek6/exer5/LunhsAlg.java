package prWeek6.exer5;

public class LunhsAlg {
    private AlgorithmValidator algorithmValidator = new AlgorithmValidator();

    public Boolean isValid(String  cardNumber) {
        Integer total = algorithmValidator.getFinalSumOfDigits(cardNumber);
        return total % 10 == 0;
    }
}
