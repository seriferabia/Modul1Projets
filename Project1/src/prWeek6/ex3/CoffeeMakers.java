package prWeek6.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    public static List<CoffeeMaker> asList(){
        return Arrays.asList(new AutomaticCoffeeMachine(), new FrenchPress(), new AutoDrip());
    }

    public static Optional<CoffeeMaker> get(String name){
        List<CoffeeMaker> coffeeMakers = asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            if(name.equalsIgnoreCase(coffeeMaker.getName())){
                return Optional.of(coffeeMaker);
            }
        }
        return Optional.empty();
    }
}
