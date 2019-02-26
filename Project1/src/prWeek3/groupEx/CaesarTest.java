package prWeek3.groupEx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    private Caesar caesar = new Caesar();

    @Test
    void testEncrypt() {
        String message = "be sure to drink your Ovaltine";
        String encryptedMessage = caesar.encrypt(message,13);
        String expected = "or fher gb qevax lbhe Binygvar";
        Assertions.assertEquals(expected, encryptedMessage);
    }
}