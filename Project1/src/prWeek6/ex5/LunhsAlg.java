package prWeek6.ex5;

public class LunhsAlg {
    private Validator validator = new Validator();

    public Boolean isValid(Long cardNumber) {
        Integer total = validator.getFinalSumOfDigits(cardNumber);
        return total % 10 == 0;
    }
}
