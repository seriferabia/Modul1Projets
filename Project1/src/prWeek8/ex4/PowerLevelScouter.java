package prWeek8.ex4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {

    public Integer scout(String name){
        return scout(name,letter->(int)letter.charAt(0));
    }

    public Integer scoutEnhanced(String name){
        return scout(name,letter->(int)letter.toLowerCase().charAt(0));
    }

    private Integer scout(String name, Function<String,Integer> function){
        List<String> letters = new ArrayList<>(Arrays.asList(name.split("")));
        int sum = 0;
        for (String letter : letters) {
            sum+=function.apply(letter);
        }
        return sum;
    }
}
