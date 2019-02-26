package prWeek8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashSymbolTest {
    private HashSymbol hashSymbol = new HashSymbol();

    @Test
    void isValidDecryption() {
        String validCase = "contains #";
        String invalidCase = "not contain";
        Assertions.assertTrue(hashSymbol.isValidDecryption(validCase));
        Assertions.assertFalse(hashSymbol.isValidDecryption(invalidCase));

    }

    @Test
    void decryptTrick() {
        String encryptedText = "s#er#ro#bo#mi#me#if#e";
        String result =hashSymbol.decryptTrick(encryptedText);
        Assertions.assertEquals("serife",result);
    }
}