package prWeek2.exercise7;


import prWeek2.exercise7.summation.First100PrimesCalculator;

public class SumApplicaton {
    public static void main(String[] args) {

        First100PrimesCalculator first100PrimesCalculator = new First100PrimesCalculator();
        int summation = first100PrimesCalculator.getSumOfThe100FirstPrimeNumbers();

        System.out.println("The summation of the first 100 prime number is "+ summation);
    }
}
