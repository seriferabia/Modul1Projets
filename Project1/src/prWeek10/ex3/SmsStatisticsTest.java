package prWeek10.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmsStatisticsTest {
    private SmsStatistics statistics = new SmsStatistics();

    @Test
    void getRatioBetweenHamAndSpam() {
        List<String> ratioBetweenHamAndSpam = statistics.getRatioBetweenHamAndSpam();
        List<String> expected = new ArrayList<>(Arrays.asList("ham is 86%","spam is 13%"));
        Assertions.assertEquals(expected,ratioBetweenHamAndSpam);
    }

    @Test
    void getMostUsedHamWord() {
        String mostUsedHamWord = statistics.getMostUsedHamWord();
        Assertions.assertEquals("to",mostUsedHamWord);
    }

    @Test
    void getMostUsedHamLetterTest() {
        String mostUsedHamWord = statistics.getMostUsedHamLetter();
        Assertions.assertEquals("e",mostUsedHamWord);
    }

    @Test
    void testNumberOfLongestSpamMessage() {
        Integer result = statistics.numberOfLongestSpamMessage();
        Assertions.assertEquals(Integer.valueOf(224),result);
    }
}