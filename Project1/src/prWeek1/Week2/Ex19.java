package Week2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Ex19 {
    public static void main(String[] args) {
        System.out.println("Welcome to our comic shop. How much do you have to pay?");
        Scanner scanner = new Scanner(System.in);
        Double price = scanner.nextDouble();

        System.out.println("How much are you going to pay?");
        Double payment = scanner.nextDouble();

        List<Double> changes = calculateChange(price, payment);

        System.out.println("Here you are "+ changes.get(0)+ " euro and "+ changes.get(1) + " cents");


    }

    public static List<Double> calculateChange(Double price, Double payment){
        Double change = payment-price;
        double euro = change.intValue();
        double cent = (change - euro)*100;
        cent = (int)cent;
        List<Double> changes= Arrays.asList(euro, cent);
        return changes;
    }
}
