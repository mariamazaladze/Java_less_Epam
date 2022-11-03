package less4.arrays;

import java.util.Arrays;

public class Deeps {
    public static void main(String[] args){
        int [][] arrayy = {{1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepToString(arrayy));   // ფრჩხილების ჩათვლით როგორ ბუდეშია ისე ბეჭდავს

        System.out.println("----------------");
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int[][] anotherArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println(Arrays.equals(array, anotherArray));
        System.out.println(Arrays.deepEquals(array, anotherArray));

        int size = 4;
        int[] testArr = new int [size];
        Arrays.fill(testArr, 1);
        System.out.println(Arrays.toString(testArr));
    }
}
