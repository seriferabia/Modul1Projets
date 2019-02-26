package prWeek2.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoordinateGatherer {

    public List<Coordinate> gatherCoordinate(){
        List<Coordinate> coordinates = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the latitude of coordinate 1: ");
        Double latitude1 = scanner.nextDouble();
        System.out.println("Write the longtitude of coordinate 1: ");
        Double longitude1 = scanner.nextDouble();
        System.out.println("Write the latitude of coordinate 2: ");
        Double latitude2 = scanner.nextDouble();
        System.out.println("Write the longtutude of coordinate 2: ");
        Double longitude2 = scanner.nextDouble();

        coordinates.add(new Coordinate(latitude1, longitude1));
        coordinates.add(new Coordinate(latitude2, longitude2));
        return coordinates;
    }
}
