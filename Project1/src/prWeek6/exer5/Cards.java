package prWeek6.exer5;

import java.util.Arrays;
import java.util.List;

public class Cards {
    public static List<CreditCard> asList(){
        return Arrays.asList(new AmericanExpress(),new MasterCard(),new Visa());
    }
}
