package prWeek7.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class SecretHandshakeMovesTranslatorTest {
    private HandshakeTranslator translator = new HandshakeTranslator();

    @Test
    void translateIntoMoves() {
        Integer price = 195;
        List<String> expected = Arrays.asList("Thousand Knuckles","Tickles Over Palm");
        Assertions.assertEquals(expected,translator.translateIntoMoves(price));
    }
}