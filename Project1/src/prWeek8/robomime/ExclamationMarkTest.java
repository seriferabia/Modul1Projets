package prWeek8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExclamationMarkTest {
    private ExclamationMark exclamationMark = new ExclamationMark();

    @Test
    void isValidDecryption() {
        String validCase = "contains!";
        String invalidCase = "not contain";
        Assertions.assertTrue(exclamationMark.isValidDecryption(validCase));
        Assertions.assertFalse(exclamationMark.isValidDecryption(invalidCase));

    }

    @Test
    void decryptTrick() {
        String encryptedText = "s!e!r!i!f!e";
        String result = exclamationMark.decryptTrick(encryptedText);
        Assertions.assertEquals("serife",result);
    }
}