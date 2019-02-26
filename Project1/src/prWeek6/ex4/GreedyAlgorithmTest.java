package prWeek6.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GreedyAlgorithmTest {
    private GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();

    @Test
    void testChange() {
        int change = 149;
        Integer sizeOfExpectedList = 7;
        List<Money> changeCoins = greedyAlgorithm.change(change);
        Integer sizeOfResultList = changeCoins.size();
        Assertions.assertEquals(sizeOfExpectedList,sizeOfResultList);

    }
}