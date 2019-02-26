package prWeek8.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {
    private KeywordFinder keywordFinder = new KeywordFinder();


    @Test
    void testFindElegant() {
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> elegants = keywordFinder.findElegant(sentence);
        List<String> expected = Arrays.asList("elephant","eleven","electricity","elevator");
        Assertions.assertEquals(expected,elegants);

    }
    @Test
    void testFindPlayful() {
        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> playfuls = keywordFinder.findPlayful(sentence);
        List<String> expected = Arrays.asList("rightful","powerful","awful","colorful");
        Assertions.assertEquals(expected,playfuls);

    }
}