package prWeek9.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prWeek9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    private FileReader fileReader = new FileReader();
    private List<String> names = fileReader.asList("prWeek9/source/names.txt");

    @Test
    void testStreams() {
        List<String> shortNames = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        Assertions.assertEquals(Arrays.asList("El"),shortNames);

        List<String> namesEndWithM = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        Assertions.assertEquals(Arrays.asList("HOSAM","TAMMAM"),namesEndWithM);

        List<String> namesWithE_R = names.stream()
                .filter(e ->e.contains("e")&&e.contains("r"))
                .collect(Collectors.toList());
        Assertions.assertEquals(Arrays.asList("Mehran", "Norbert", "Serife"),namesWithE_R);

        List<String> namesWithCondition = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
        Assertions.assertEquals(Arrays.asList("maarj", "aamin", "omaar"),namesWithCondition);
    }




}
