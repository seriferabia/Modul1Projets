package prWeek8.reflection8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Skii extends Thermostat {
    public Skii(Predicate<Double> condition, Function<Double,String> display) {
        super(condition, display);
    }
}
