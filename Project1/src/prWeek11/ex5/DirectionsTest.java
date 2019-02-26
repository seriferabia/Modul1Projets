package prWeek11.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectionsTest {
    private Directions3 directions = new Directions3();

    @Test
    void simplifyDirections() {
        List<String> allDirections = new ArrayList<>(Arrays.asList("NORTH", "SOUTH", "EAST", "WEST"));
        List<String> expected = new ArrayList<>();
        Assertions.assertEquals(expected,directions.simplifyDirections(allDirections));

        allDirections = new ArrayList<>(Arrays.asList("NORTH", "EAST", "WEST", "SOUTH", "SOUTH", "WEST"));
        expected = new ArrayList<>(Arrays.asList("SOUTH", "WEST"));
        Assertions.assertEquals(expected,directions.simplifyDirections(allDirections));

        allDirections = new ArrayList<>(Arrays.asList("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"));
        expected = new ArrayList<>(Arrays.asList("WEST"));
        Assertions.assertEquals(expected,directions.simplifyDirections(allDirections));

    }
}