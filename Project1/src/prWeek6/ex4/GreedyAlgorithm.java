package prWeek6.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyAlgorithm {
    private List<Money> moneyList = Arrays.asList(new Cent50(),new Cent20(),
            new Cent10(), new Cent5(), new Cent2(),new Cent1());

    private List<Money> changeCoins = new ArrayList<>();

    public List<Money> change(Integer change) {
        if (change==0){
            return new ArrayList<>();
        }
        for (Money money : moneyList) {
            Integer times = 0;
            if(money.isApplicable(change)){
                times = change/money.getAmount();
            }
            addToList(changeCoins, money, times);
            change=change-times*money.getAmount();
        }
        return changeCoins;

    }

    private void addToList(List<Money> changeCoins, Money money, Integer times) {
        for (int time = 0; time < times; time++) {
            changeCoins.add(money);
        }
    }

}
