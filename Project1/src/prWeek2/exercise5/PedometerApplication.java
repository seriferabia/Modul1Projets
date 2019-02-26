package prWeek2.exercise5;

import java.util.List;

public class PedometerApplication {
    public static void main(String[] args) {

        StepGatherer stepGatherer = new StepGatherer();
        List<Integer> steps = stepGatherer.getNumberOfSteps();

        AverageCalculator averageCalculator = new AverageCalculator();
        Double averageStep = averageCalculator.calculateAverage(steps);

        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Double distance = distanceCalculator.calculateDistance(averageStep);

        System.out.println("You walked "+ distance + "km.");

    }
}
