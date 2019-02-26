package prWeek5.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeBuilderTest {
    private WardrobeBuilder builder = new WardrobeBuilder();


    @Test
    void testBuild() {
        String parts ="bottom, side, side, back, top, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door";
        String[] split = parts.split(", ");
        List<String> steps = Arrays.asList(split);
        Wardrobe wardrobe = builder.build();
        List<String> wardrobeParts = wardrobe.getParts();
        Assertions.assertEquals(steps,wardrobeParts);

    }
}