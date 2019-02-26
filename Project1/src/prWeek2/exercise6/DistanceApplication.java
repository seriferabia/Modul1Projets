package prWeek2.exercise6;

import java.util.List;

public class DistanceApplication {
    public static void main(String[] args) {

        CoordinateGatherer coordinateGatherer = new CoordinateGatherer();
        List<Coordinate> coordinates = coordinateGatherer.gatherCoordinate();

        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Double distance = distanceCalculator.calculateDistance(coordinates.get(0), coordinates.get(1));

        System.out.println("Distance is " + distance);
    }
}
