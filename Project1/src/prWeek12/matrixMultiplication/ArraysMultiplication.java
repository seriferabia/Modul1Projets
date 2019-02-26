package prWeek12.matrixMultiplication;

public class ArraysMultiplication {
    public int[][] multiply(int[] array1, int[] array2){
        int[][] result = new int[array1.length][array2.length];
        for (int row = 0; row< array1.length; row++) {
            for (int column = 0; column < array2.length; column++) {
                result[row][column]=array1[row]*array2[column];
            }
        }
        return result;
    }
}
