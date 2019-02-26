package Week4;

import Week4.Main;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        Integer number = Main.getANumber();
        List<Integer> digits = getDigits(number);
        System.out.println("Digits of " + number + " are "+digits);
    }

    public static List<Integer> getDigits(Integer number) {
        List<Integer> digits = new ArrayList<>();

        while(number>0){
            int lastDigit = number%10;
            digits.add(lastDigit);
            number = (number-lastDigit)/10;
        }
        return Ex3.reverse(digits);
    }

}
