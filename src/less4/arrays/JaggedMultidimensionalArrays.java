package less4.arrays;

import java.util.Arrays;

public class JaggedMultidimensionalArrays {
    public static void main(String[] args){
        int[][] arr = new int [4][];
        arr[0] = new int [5];
        System.out.println(Arrays.toString(arr[0]));

///
        int[] numbers = { 1, 3, 5, 7, 9 };
        int[][] array = new int[3][];
        array[0] = numbers;
        array[2] = new int[] { 2, 4, 6, 8 };
        for (int[] row : array) {
            if (row != null) {
                for (int element : row) {
                    System.out.print(element + "");
                }
            } else {
                System.out.print(row);
            }
            System.out.println();
        }


        String[] ejgStr = new String[1];
        String[] ejgStr1 = null;
        String[] ejgStr2 = { null };
        System.out.println(ejgStr[0] + " ==== " + ejgStr2[0] + "  " + ejgStr1[0]);
    }

}
