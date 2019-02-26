package prWeek2.exercise7.summation;

import java.util.List;

public class First100PrimesCalculator {
    public Integer getSumOfThe100FirstPrimeNumbers(){

        IntegerProvider integerProvider = new IntegerProvider();
        List<Integer> integers = integerProvider.getIntegers();

        PrimeProvider primeProvider = new PrimeProvider();
        List<Integer> primes = primeProvider.getPrimes(integers);

        Summation summation = new Summation();
        Integer sumOfPrimes = summation.sumNumbers(primes);

        return  sumOfPrimes;
    }
}
