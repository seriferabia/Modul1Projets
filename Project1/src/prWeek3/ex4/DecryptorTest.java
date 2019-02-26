package prWeek3.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptorTest {

    private Encryptor encryptor = new Encryptor();
    private Decryptor decryptor = new Decryptor();

    private String encryptedMessage = "s!3@@r&1#f%%%3 one1eight4 ";

    @Test
    void testDecrypt() {

        String decryptedMessage = decryptor.decrypt(encryptedMessage);
        Assertions.assertFalse(decryptedMessage.matches(".*[!@#$%&*+=-].*"));
    }
}