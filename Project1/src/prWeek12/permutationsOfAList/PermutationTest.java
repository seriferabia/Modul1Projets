package prWeek12.permutationsOfAList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class PermutationTest {


    @Test
    void testPermutation2() {
        Permutation2 permutation = new Permutation2();
        int limit = 6;
        List<Integer> numbers = IntStream.range(1, limit)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Numbers: "+numbers);
        System.out.println(permutation.permute(numbers));
    }

    @Test
    void testPermutation3() {
        Permutation3 permutation = new Permutation3();
        int limit = 6;
        List<Integer> numbers = IntStream.range(1, limit)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Numbers: "+numbers);
        int expectedSize = numbers.stream().reduce(1,(e1,e2)->e1*e2);
        int actualSize = permutation.permute(numbers).size();
        Assertions.assertEquals(expectedSize, actualSize);
    }
    @Test
    void testPermutation4() {
        Permutation4 permutation = new Permutation4();
        int limit = 6;
        List<Integer> numbers = IntStream.range(1, limit)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Numbers: "+numbers);
        int expectedSize = numbers.stream().reduce(1,(e1,e2)->e1*e2);
        int actualSize = permutation.permute(numbers).size();
        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    void testPermutation7() {
        Permutation7 permutation = new Permutation7();
        int limit = 6;
        List<Integer> numbers = IntStream.range(1, limit)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Numbers: "+numbers);
        int expectedSize = numbers.stream().reduce(1,(e1,e2)->e1*e2);
        int actualSize = permutation.permute(numbers).size();
        Assertions.assertEquals(expectedSize, actualSize);
    }
}