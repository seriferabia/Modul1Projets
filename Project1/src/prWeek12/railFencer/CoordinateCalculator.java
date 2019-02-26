package prWeek12.railFencer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CoordinateCalculator {
    private List<Step> steps = Arrays.asList(new ToDown(), new ToUp());

    public List<Coordinate> sortedCoordinatesOfLetters(String text, Integer numberOfRows) {
        List<Coordinate> coordinates = getCoordinatesOfLetters(text, numberOfRows);
        return coordinates.stream()
                .sorted(Comparator.comparing(Coordinate::getRow))
                .collect(Collectors.toList());
    }

    public List<Coordinate> getCoordinatesOfLetters(String text, Integer numberOfRows) {
        Step downStep = steps.get(0);
        Step upStep = steps.get(1);
        List<Coordinate> coordinates = new ArrayList<>();
        Coordinate coordinate = new Coordinate(0, 0);
        coordinates.add(coordinate);
        while (coordinate.getColumn() < text.length()) {
            while (downStep.isThereMore(coordinate, text, numberOfRows)) {
                coordinate = downStep.getNextCoordinate(coordinate);
                coordinates.add(coordinate);
            }
            coordinate.setRow(coordinate.getRow() - 2);
            while (upStep.isThereMore(coordinate, text, numberOfRows)) {
                coordinate = upStep.getNextCoordinate(coordinate);
                coordinates.add(coordinate);
            }
            coordinate.setRow(coordinate.getRow() + 2);
        }
        removeExtraCoordinate(coordinates);
        return coordinates;
    }

    private void removeExtraCoordinate(List<Coordinate> coordinates) {
        coordinates.remove(coordinates.get(coordinates.size() - 1));
    }
}