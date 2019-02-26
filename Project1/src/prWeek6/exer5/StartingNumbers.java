package prWeek6.exer5;

import java.util.List;

public class StartingNumbers extends Validator {
    public StartingNumbers(Integer... possibilities) {
        super(possibilities);
    }

    @Override
    public Boolean isValid(String cardNumber) {
        return possibilities.stream()
                .map(String::valueOf)
                .anyMatch(e-> cardNumber.startsWith(e));
    }

}
