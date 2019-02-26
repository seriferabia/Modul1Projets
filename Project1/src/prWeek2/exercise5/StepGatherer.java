package prWeek2.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {
    public List<Integer> getNumberOfSteps(){

        List<Integer> steps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("Please write number of steps: ");
            steps.add(scanner.nextInt());
        }
        return steps;
    }
}
