package Week5;

import Week4.Main;

public class Ex1 {

    public static void main(String[] args) {
        Integer number = Main.getANumber();
        System.out.println(fizzBuzz(number));

    }
    public static boolean isMultiple(int num1, int num2){
        if(num2 == 0 || num1 %num2 != 0){
            return false;
        }
        return true;
    }
    public static String fizzBuzz(int number){
        if(isMultiple(number,15)){
            return "FizzBuzz";
        }
        if(isMultiple(number,3)){
            return "Fizz";
        }
        if(isMultiple(number,5)){
            return "Buzz";
        }
        return null;
    }
}
