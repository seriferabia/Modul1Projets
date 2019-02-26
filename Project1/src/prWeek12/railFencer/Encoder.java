package prWeek12.railFencer;

import java.util.List;
import java.util.stream.Collectors;

public class Encoder {
    private CoordinateCalculator calculator = new CoordinateCalculator();

    public String encode(String text, Integer numberOfRows) {
        List<Coordinate> sortedCoordinates = calculator.sortedCoordinatesOfLetters(text, numberOfRows);
        return sortedCoordinates.stream()
                .map(e->text.charAt(e.getColumn()))
                .map(e->e.toString())
                .collect(Collectors.joining());
    }
}
