package prWeek6.exer5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class CreditCard {

    private List<Validator> validators;

    public CreditCard(Validator... validators) {
        this.validators = Stream.of(validators).collect(Collectors.toList());
    }

    public List<Validator> getValidators() {
        return validators;
    }

    public abstract String getName();
}
