package prWeek8.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {
    private PowerLevelScouter scouter = new PowerLevelScouter();

    @Test
    void testScout() {
        Integer result = scouter.scout("Susana");
        Assertions.assertEquals(Integer.valueOf(619),result);
    }

    @Test
    void testScoutEnhanced() {
        Integer result = scouter.scoutEnhanced("Susana");
        Assertions.assertEquals(Integer.valueOf(651),result);


    }
}