package Week5;
import Week4.Main;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = Main.getRandomNumbers(8);
        System.out.println(numbers);
        int one = Main.getANumber();
        int two = Main.getANumber();
        List<Integer> replaced = getReplacedNumber(numbers, one, two);
        System.out.println(replaced);

    }

    private static List<Integer> getReplacedNumber(List<Integer> numbers, int one, int two) {
        List<Integer> replaced = new ArrayList<>();
        for (int number : numbers ) {
            if(number==one){
                number = two;
            }
            replaced.add(number);
        }
        return replaced;
    }


}
