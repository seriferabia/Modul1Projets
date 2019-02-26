package prWeek8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    private Sensor sensor = new Sensor();

    @Test
    void getDecryptedTricks() {
        List<String> testTexts = new ArrayList<>(Arrays.asList("s!e!r!i!f!e",
                "e&fi&re&s","s#er#ro#bo#mi#me#if#e","serife"));
        List<String> expected = Arrays.asList("serife","serife","serife");
        List<String> result = sensor.getDecryptedTricks(testTexts);
        Assertions.assertEquals(expected,result);
    }
}