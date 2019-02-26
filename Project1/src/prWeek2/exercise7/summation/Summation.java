package prWeek2.exercise7.summation;

import java.util.List;

public class Summation {

    Integer sumNumbers(List<Integer> numbers){
        int sum = 0;
        for (int number:numbers ) {
            sum += number;
        }
        return sum;
    }
}
