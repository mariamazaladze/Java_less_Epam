package less4.arrays;

import java.util.Arrays;

public class Two_DemisionalArraySUM {
    public static void main(String[] args){
        System.out.println();
        int[][] array2D = { { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 0, 2, 0, 4, 0 } };
        int sum = 0;
        for (int[]row : array2D) {
            for (int element : row) {
                sum = sum + element;
                System.out.print(element + " ");
            }
            System.out.println();
        }
//        for (int[] row : array2D) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println("sum = " + sum);



    }
}
