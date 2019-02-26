package Week3;
import Week4.Main;

import java.util.ArrayList;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> serialNumbers = new ArrayList<>();
        serialNumbers = Main.getRandomNumbers(10);
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer number:serialNumbers) {
            if(isEven(number)){
                evenNumbers.add(number);
            }else{
                oddNumbers.add(number);
            }

        }
        System.out.println(serialNumbers);
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }
    public static Boolean isEven(Integer number){
        if(number%2==0){
            return  true;
        }
        return false;
    }
}
