package prWeek7.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {
    private MoneyCalculator calculator = new MoneyCalculator();

    @Test
    void testAccumulateEmptyList(){
        List<Integer> payments = new ArrayList<>();
        Assertions.assertEquals(Integer.valueOf(0),calculator.accumulate(payments));

    }
    @Test
    void testAccumulate(){
        List<Integer> payments = Arrays.asList(1,2,3,4,5,5,4,3,2,1);
        Assertions.assertEquals(Integer.valueOf(30),calculator.accumulate(payments));

    }
}