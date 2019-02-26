package prWeek6.ex4;

import prWeek6.ex4.GreedyAlgorithm;
import prWeek6.ex4.Money;

import java.util.List;

public class MoneyApplication {

    public static void main(String[] args) {
        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> coins = greedyAlgorithm.change(149);
        System.out.println("Coins :" +coins);
        System.out.println("The number of coins is "+coins.size());

    }
}
