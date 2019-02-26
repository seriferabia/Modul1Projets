package prWeek12.railFencer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoderTest {
    private Decoder decoder = new Decoder();

    @Test
    void testDecode() {
        String[][] decodes = {{"WECRLTEERDSOEEFEAOCAIVDEN", "WEAREDISCOVEREDFLEEATONCE"},    // 3 rails
                {"H !e,Wdloollr", "Hello, World!"},    // 4 rails
                {"", ""}                               // 3 rails (even if...)
        };
        int[] rails = {3, 4, 3};
        for (int i = 0; i < decodes.length; i++) {
            assertEquals(decodes[i][1], decoder.decode(decodes[i][0], rails[i]));
        }
    }
}