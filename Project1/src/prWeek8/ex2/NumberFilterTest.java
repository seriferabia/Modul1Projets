package prWeek8.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    private NumberFilter numberFilter = new NumberFilter();


    @Test
    void testGetEvenNumbers() {
        List<Integer> filteredEvens = numberFilter.getEvenNumbers(numbers);
        List<Integer> expected = Arrays.asList(2,4,6,8,10);
        Assertions.assertEquals(expected,filteredEvens);

    }

    @Test
    void testGetOddNumbers() {
        List<Integer> filteredOdds = numberFilter.getOddNumbers(numbers);
        List<Integer> expected = Arrays.asList(1,3,5,7,9);
        Assertions.assertEquals(expected,filteredOdds);

    }

}