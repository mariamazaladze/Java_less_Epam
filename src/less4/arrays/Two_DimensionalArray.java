package less4.arrays;

import java.util.Arrays;

public class Two_DimensionalArray {
    public static void main (String[] args){
        int[][] multiplicationTable = new int[5][];
        System.out.println("multiplicationTable = " + multiplicationTable );
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[5];
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        System.out.println("\nInitialization array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(" " + multiplicationTable[i][j]);
            }
            System.out.println();
        }

        int[][] array2D = new int[10][1];
        array2D[0][0] = 10;
        array2D[2][0] = 11;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("="+array2D[i][j]);
            }
        }

    }
}
