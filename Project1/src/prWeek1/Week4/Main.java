package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = getRandomNumbers(9);
        // System.out.println(numbers);

    }
    public static List<Integer> getRandomNumbers(Integer size){
        List<Integer> numbers = new ArrayList<>();

        for(int i=0; i<size; i++){
            Double number = (Math.random()*100);
            Integer newNumber = number.intValue();
            numbers.add(newNumber);
        }
        return  numbers;
    }
    public static Integer getANumber(){
        System.out.println("Tell me a number: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        return  number;
    }
}
