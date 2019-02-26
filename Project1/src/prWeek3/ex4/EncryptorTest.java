package prWeek3.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncryptorTest {

    private static final String message = "serife 18";

    Encryptor encryptor = new Encryptor();

    @Test
    void testSize() {
        int sizeOfMessage = message.length();
        String encryptedMessage = encryptor.encrypt(message);
        int sizeOfNewMessage = encryptedMessage.length();
        Assertions.assertFalse(sizeOfMessage==sizeOfNewMessage);

    }

    @Test
    void testVowel() {

        String encryptedMessage = encryptor.encrypt(message);
        Assertions.assertFalse(encryptedMessage.matches(".*[aeiou].*"));

    }


}