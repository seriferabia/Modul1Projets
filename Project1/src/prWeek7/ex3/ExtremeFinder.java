package prWeek7.ex3;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ExtremeFinder {
    private ListProvider listProvider =new ListProvider();

    public Extreme getExtreme(List<Integer> numbers) {
        OptionalInt min = getMin(numbers);
        OptionalInt max = getMax(numbers);
        if(min.isPresent()&&max.isPresent()){
            return new Extreme(Optional.of(min.getAsInt()),Optional.of(max.getAsInt()));
        }else {
            return new Extreme(Optional.of(0),Optional.of(0));
        }

    }

    public OptionalInt getMin(List<Integer> numbers) {
        return numbers.stream().mapToInt(e -> e).min();
    }
    public OptionalInt getMax(List<Integer> numbers) {
        return numbers.stream().mapToInt(e -> e).max();
    }

}
