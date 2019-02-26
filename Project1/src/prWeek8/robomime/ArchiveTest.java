package prWeek8.robomime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArchiveTest {
    private Archive archive = new Archive();

    @Test
    void getUniqueTricks() {
//        List<String> testList = new ArrayList<>(Arrays.asList("serifefires".split("")));
//        Set<String> result = archive.getUniqueTricks(testList);
//        boolean checking = result.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .allMatch(e -> e.getValue() == 1);
//        Assertions.assertTrue(checking);
        List<String> tricks = Arrays.asList("move", "dance", "move");
        Set<String> unique = archive.getUniqueTricks(tricks);
        Set<String> expected = new HashSet<>(Arrays.asList("move", "dance"));
        Assertions.assertEquals(expected, unique);
    }
}