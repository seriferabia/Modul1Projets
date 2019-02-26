package prWeek8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndSymbolTest {
    private AndSymbol andSymbol = new AndSymbol();

    @Test
    void isValidDecryption() {
        String validCase = "contains &";
        String invalidCase = "not contain";
        Assertions.assertTrue(andSymbol.isValidDecryption(validCase));
        Assertions.assertFalse(andSymbol.isValidDecryption(invalidCase));

    }

    @Test
    void decryptTrick() {
        String encryptedText = "e&fi&re&s";
        String result = andSymbol.decryptTrick(encryptedText);
        Assertions.assertEquals("serife",result);
    }
}