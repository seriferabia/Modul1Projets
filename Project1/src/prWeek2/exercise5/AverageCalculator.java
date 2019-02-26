package prWeek2.exercise5;

import java.util.List;

public class AverageCalculator {
    public Double calculateAverage(List<Integer> steps){
        if(steps.size() == 0) {
            return 0.0;
        }
        double sum = 0;
        for (Integer number:steps ) {
            sum += number;
        }
        return sum/steps.size();
    }
}

