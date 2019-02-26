package prWeek7.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ListProvider {
    private Random random = new Random();

    public List<Integer> getListOfInteger(){
        int sizeOfList = random.nextInt(10)+5;
        List<Integer> numbers = new ArrayList<>();
        IntStream.range(0,sizeOfList).forEach(e->{numbers.add(random.nextInt(1001));});
        return numbers;
    }
}
