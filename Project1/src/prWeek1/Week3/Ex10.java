package Week3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Tell me amount of fibonacci series: ");
        Scanner scanner = new Scanner(System.in);
        Integer amount = scanner.nextInt();

        System.out.println(calculateFibo(amount));


    }

    public static List<Integer> calculateFibo(Integer amount){
        List<Integer> fiboNumbers = new ArrayList<>();
        if(amount==0){
            return fiboNumbers;
        }
        if(amount==1){
            int number = 0;
            fiboNumbers.add(number);
            return fiboNumbers;
        }

        int number=0;
        fiboNumbers.add(number);

        number=1;
        fiboNumbers.add(number);

        Integer position = 2;

        while( position < (amount) ){
            number = fiboNumbers.get(position-2) + fiboNumbers.get(position-1);
            fiboNumbers.add(number);
            position++;
        }
        return fiboNumbers;

    }

}
