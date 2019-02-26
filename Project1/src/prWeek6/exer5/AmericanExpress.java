package prWeek6.exer5;

import java.util.Arrays;

public class AmericanExpress extends CreditCard {

    public AmericanExpress() {
        super(new Length(15),new StartingNumbers(34,37));
    }

    @Override
    public String getName() {
        return "American Express";
    }
}
