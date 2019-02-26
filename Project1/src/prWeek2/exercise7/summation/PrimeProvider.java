package prWeek2.exercise7.summation;

import java.util.ArrayList;
import java.util.List;

public class PrimeProvider {

    List<Integer> getPrimes(List<Integer> integers){

        List<Integer> primes = new ArrayList<>();
        int position = 0;
        while(primes.size()<100){
            int number = integers.get(position);
            if(isPrime(number)){
                primes.add(number);
            }
            position++;
        }

        return primes;
    }

    private boolean isPrime(int number){
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++){
            if (number % i == 0){
                return false; }
        } return true;
    }


}
