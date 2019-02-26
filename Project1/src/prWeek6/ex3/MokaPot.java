package prWeek6.ex3;

public class MokaPot extends CoffeeMaker {
    @Override
    public String getName() {
        return "Moka pot";
    }

    @Override
    public Integer getBrewingTime() {
        return 15;
    }
}
