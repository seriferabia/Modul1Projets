package Week4;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> numbers = Main.getRandomNumbers(8);
        int max = getBiggest(numbers);
        int min = getSmallest(numbers);
        System.out.println(numbers);
        System.out.println("The biggest is "+ max + " and the smallest is "+min);

    }
    public static Boolean isBigger(Integer num1, Integer num2){
        return num1>num2;
    }
    public static Boolean isSmaller(Integer num1, Integer num2){
        return num1<num2;
    }
    public static Integer getBiggest(List<Integer> numbers){
        int biggest = numbers.get(0);
        for (int number:numbers ) {
            if(isBigger(number, biggest)){
                biggest = number;
            }
        }
        return biggest;
    }
    public static Integer getSmallest(List<Integer> numbers){
        int smallest  = numbers.get(0);
        for (int number:numbers ) {
            if(isSmaller(number, smallest)){
                smallest = number;
            }
        }
        return smallest;
    }
}
