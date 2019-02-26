package prWeek6.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    private static List<String> names = Arrays.asList("Automatic coffee machine","French press","Auto drip","Moka pot");

    public static void main(String[] args) {
        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            System.out.println(coffeeMaker.brew().getMadeBy()+" brewed a coffee and it took "+ coffeeMaker.brew().getBrewedTime()+ " minutes.");
        }
        System.out.println("------------------");
        for (String name:names) {
            Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
            if(coffeeMaker.isPresent()){
                Coffee coffee = coffeeMaker.get().brew();
                System.out.println(coffee.getMadeBy()+" brewed a coffee and it took "+ coffee.getBrewedTime()+ " minutes.");
            }else{
                System.out.println("The coffee maker with the name "+ name + " is not available.");
            }

        }
    }
}
