package replit;

import java.util.Arrays;

public class Array2DMultiplication {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];
        for (int row = 0; row < multiplicationTable.length; row++){
            for (int column = 0; column < multiplicationTable[row].length; column++){
                multiplicationTable[row][column] = (row+1) * (column+1);
            }
        }

        System.out.println(Arrays.deepToString(multiplicationTable));
    }
}
