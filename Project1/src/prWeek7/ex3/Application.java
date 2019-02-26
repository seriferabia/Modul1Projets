package prWeek7.ex3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ListProvider listProvider = new ListProvider();
        List<Integer> listOfInteger = listProvider.getListOfInteger();
        System.out.println(listOfInteger);
        ExtremeFinder extremeFinder = new ExtremeFinder();
        Extreme extremes = extremeFinder.getExtreme(new ArrayList<>());
        System.out.println(extremes);
    }
}
