package prWeek6.exer5;

import java.util.Arrays;
import java.util.List;

public class Visa extends CreditCard {

    public Visa() {
        super(new Length(13,16),new StartingNumbers(4));
    }

    @Override
    public String getName() {
        return "Visa";
    }
}
