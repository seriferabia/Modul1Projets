package prWeek7.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ExtremeTest {
    private ExtremeFinder extremeFinder = new ExtremeFinder();

    @Test
    void testMax() {
        List<Integer> numbers = Arrays.asList(-1,3,0,2,4,5,6,7,8);
        Optional<Integer> max = extremeFinder.getExtreme(numbers).getMax();
        Assertions.assertEquals(Optional.of(8),max);
    }
    @Test
    void testMin() {
        List<Integer> numbers = Arrays.asList(-1,3,0,2,4,5,6,7,8);
        Optional<Integer> min = extremeFinder.getExtreme(numbers).getMin();
        Assertions.assertEquals(Optional.of(-1),min);
    }
    @Test
    void testEmpty() {
        List<Integer> numbers = new ArrayList<>();
        Optional<Integer> max = extremeFinder.getExtreme(numbers).getMax();
        Optional<Integer> min = extremeFinder.getExtreme(numbers).getMin();
        Assertions.assertEquals(Optional.of(0),max);
        Assertions.assertEquals(Optional.of(0),min);
    }


}