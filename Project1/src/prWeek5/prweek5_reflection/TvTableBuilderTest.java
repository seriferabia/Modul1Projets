package prWeek5.prweek5_reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilderTest {
    private TvTableBuilder builder = new TvTableBuilder();

    @Test
    void testBuild() {
        String part = "leg,leg,leg,leg,shelf,top";
        List<String> parts = Stream.of(part.split(",")).collect(Collectors.toList());
        TvTable tvTable = builder.build();
        List<String> tvTableParts = tvTable.getParts();
        Assertions.assertEquals(parts,tvTableParts);


    }
}