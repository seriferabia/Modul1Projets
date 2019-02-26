package prWeek6.exer5;

public class Length extends Validator {

    public Length(Integer... possibilities) {
        super(possibilities);
    }

    @Override
    public Boolean isValid(String cardNumber) {
        return possibilities.contains(cardNumber.length());
    }

}
