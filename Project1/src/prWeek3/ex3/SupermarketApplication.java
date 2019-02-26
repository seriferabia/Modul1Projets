package prWeek3.ex3;

import java.util.Random;

public class SupermarketApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Double randomDouble = random.nextDouble();
        Double weight =randomDouble*100;
        System.out.println(weight);

        NumberCorrector numberCorrector = new NumberCorrector();
        Integer correctWeight = numberCorrector.correct(weight);
        System.out.println("Your correct weight is " + correctWeight);

    }




}
