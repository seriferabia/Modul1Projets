package prWeek7.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class MoneyCollector {
    private static Random random = new Random();

    public static List<Integer> getPayments(Integer numberOfFriends){
        List<Integer> payments = new ArrayList<>();
        IntStream.range(0,numberOfFriends).forEach(e -> { payments.add(random.nextInt(5)+1);});
        return payments;


//        for (int times = 0; times < 10; times++) {
//            payments.add(random.nextInt(5)+1);
//        }
//        return payments;
    }
}
