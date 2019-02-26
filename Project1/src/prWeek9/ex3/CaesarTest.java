package prWeek9.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    private Caesar caesar = new Caesar();

    @Test
    void cipher() {
        String ciphertext = caesar.cipher("HELLO",1);
        Assertions.assertEquals("IFMMP",ciphertext);

        ciphertext = caesar.cipher("hello, world",13);
        Assertions.assertEquals("uryyb, jbeyq",ciphertext);

        ciphertext = caesar.cipher("be sure to drink your Ovaltine",13);
        Assertions.assertEquals("or fher gb qevax lbhe Binygvar",ciphertext);

    }
}