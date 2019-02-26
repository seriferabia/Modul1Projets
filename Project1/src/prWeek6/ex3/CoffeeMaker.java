package prWeek6.ex3;

public abstract class CoffeeMaker {
    public abstract String getName();
    public abstract Integer getBrewingTime();
    public Coffee brew(){
        return new Coffee(getName(),getBrewingTime());
    }
}
