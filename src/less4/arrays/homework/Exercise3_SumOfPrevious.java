package less4.arrays.homework;

import java.util.Arrays;

/**
 * თითოეული ცვლადი წინა 2 ჩანაწერის ჯამი თუა დააბრუნე true. პირველი 2 ცვლადი გარანტირებულად False ია
 * Description
 * Please, proceed to com.epam.rd.autotasks.arrays.SumOfPrevious class and implement getSumCheckArray method.
 * The correct implementation should receive an array of int values and return an array of booleans
 * where each element is a result of a check if a corresponding element is a sum of two previous elements in given array.
 * Details:
 * The length of given array is guaranteed to be 2 or more.
 * Given array is guaranteed to be not null.
 * Method returns an array of booleans where each element is a result for corresponding element in given array.
 * First two elements of the boolean array are always false.
 */
public class Exercise3_SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{24, 12, 20, 12, 12, 24, 12};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        if (array == null) {
            System.out.println(0);
        }
        boolean[] resalt = new boolean[array.length];
        if (array.length > 2) {
            resalt[0] = false;
            resalt[1] = false;
            for (int i = 2; i < array.length; i++) {
                if (array[i] == array[i - 2] + array[i - 1]) {
                    resalt[i] = true;
                } else {
                    resalt[i] = false;
                }
            }
        } else System.out.println("length less than it should be");
        return resalt;
    }
}
