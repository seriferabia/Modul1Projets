package prWeek11.ex3Interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeWithWordsTest {


    @Test
    void testPartA() {
        String withWords = PartA.toWords(3, 00);
        assertEquals("three o'clock",withWords);

        withWords = PartA.toWords(5,47);
        assertEquals("thirteen minutes to six", withWords);

        withWords = PartA.toWords(5,27);
        assertEquals("twenty seven minutes past five", withWords);
    }

    @Test
    void testPartB() {
        String withWords = PartB.toWords(5,47);
        assertEquals("thirteen minutes to six at night",withWords);

        withWords = PartB.toWords(15,0);
        assertEquals("three o'clock in the afternoon",withWords);

        withWords = PartB.toWords(12,0);
        assertEquals("noon",withWords);

        withWords = PartB.toWords(23,59);
        assertEquals("one minutes to twelve at night",withWords);

        withWords = PartB.toWords(0,0);
        assertEquals("midnight",withWords);
    }
}