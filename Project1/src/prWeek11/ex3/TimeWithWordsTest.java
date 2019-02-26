package prWeek11.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeWithWordsTest {
    private TimeWithWords timeWithWords = new TimeWithWords();
    private PartB partB = new PartB();

    @Test
    void testToWordsPartA() {
        String withWords = timeWithWords.toWords(3, 00);
        Assertions.assertEquals("three o'clock",withWords);

        withWords = timeWithWords.toWords(5,47);
        Assertions.assertEquals("thirteen minutes to six", withWords);

        withWords = timeWithWords.toWords(5,27);
        Assertions.assertEquals("twenty seven minutes past five", withWords);
    }

    @Test
    void testToWordsPartB() {
        String withWords = partB.toWords(5,47);
        Assertions.assertEquals("thirteen minutes to six at night",withWords);

        withWords = partB.toWords(15,0);
        Assertions.assertEquals("three o'clock in the afternoon",withWords);

        withWords = partB.toWords(12,0);
        Assertions.assertEquals("noon",withWords);

        withWords = partB.toWords(23,59);
        Assertions.assertEquals("one minutes to twelve at night",withWords);

        withWords = partB.toWords(0,0);
        Assertions.assertEquals("Midnight",withWords);




    }
}