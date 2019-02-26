package prWeek7.ex3;

import java.util.*;

public class Extreme {
    private Optional<Integer> min;
    private Optional<Integer> max;

    public Extreme(Optional<Integer> min, Optional<Integer> max) {
        this.min = min;
        this.max = max;
    }

    public Optional<Integer> getMin() {
        return min;
    }

    public Optional<Integer> getMax() {
        return max;
    }

    @Override
    public String toString() {
        return  "min=" + min +
                ", max=" + max ;
    }
}
