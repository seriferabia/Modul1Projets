package prWeek6.exer5;

import java.util.Arrays;
import java.util.List;

public class MasterCard extends CreditCard {
    public MasterCard() {
        super(new Length(16),new StartingNumbers(51,52,53,54,55));
    }

    @Override
    public String getName() {
        return "Master Card";
    }
}
