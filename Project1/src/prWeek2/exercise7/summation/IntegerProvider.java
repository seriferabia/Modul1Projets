package prWeek2.exercise7.summation;

import java.util.ArrayList;
import java.util.List;

public class IntegerProvider {

    List<Integer> getIntegers(){
        List<Integer> integers = new ArrayList<>();
        for(int i=0; i<=550; i++){
            integers.add(i);
        }
        return integers;

    }
}
