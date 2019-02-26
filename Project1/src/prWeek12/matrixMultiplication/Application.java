package prWeek12.matrixMultiplication;

import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        ArraysMultiplication multiplication = new ArraysMultiplication();
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[][] result = multiplication.multiply(array1, array2);
        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array2.length; column++) {
                System.out.print(result[row][column]);
            }
            System.out.println();
        }
    }
}
