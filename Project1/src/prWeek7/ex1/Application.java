package prWeek7.ex1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> payments = MoneyCollector.getPayments(10);
        System.out.println(payments);
        MoneyCalculator calculator = new MoneyCalculator();
        System.out.println(calculator.accumulate(payments));

    }
}
