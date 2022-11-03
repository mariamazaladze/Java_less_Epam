package less4.arrays.homework;

import java.util.Arrays;

/**
 * 1. ერთი ინდექსით გადავწიოთ ბოლო გახდება პირველი და ესე ციკლში .
 * 2. გადაცემული პარამეტრის რაოდენობით გადავაადგილოთ ნაცვლდ 1 ისა.
 * Description
 * Please, proceed to CycleSwap class and implement its static methods:
 * <p>
 * 1.void cycleSwap(int[] array)
 * Shifts all the elements in the given array to the right by 1 position.
 * In this case, the last array element becomes first.
 * For example, 1 3 2 7 4 becomes 4 1 3 2 7.
 * 2.void cycleSwap(int[] array, int shift)
 * Shift all the elements in the given array to the right in the cycle manner by shift positions.
 * Shift value is guaranteed to be non-negative and not bigger than the array length.
 * For example, 1 3 2 7 4 with a shift of 3 becomes 2 7 4 1 3.
 * For a greater challenge, try not using loops in your code (not mandatory).
 * Note that input array may be empty.
 */
public class Exercise5_CycleSwap {
    public static void main(String[] args) {
       int[] array = new int[]{1, 3, 2, 7, 4};
       // int[] array = new int[]{};
        System.out.println(Arrays.toString(cycleSwap(array, 1)));
      //  System.out.println(Arrays.toString(cycleSwap(array)));
    }

    static int[] cycleSwap(int[] array) {
        if (array == null) {
            System.out.println(Arrays.toString(array));
        }
//        for (int i = 0; i < array.length - 1; i++) {                       //  change  2 value without new variable
//            array[i] =                    array[array.length - 1] + array[i];                 // first = last + first
//            array[array.length - 1] =     array[i] - array[array.length - 1];  // last = first -last
//            array[i] =                    array[i] - array[array.length - 1];                 // first= first-last
//        }
//     __________________OR___________
        int x = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = x;
        return array;
    }

    static int[] cycleSwap(int[] array, int shift) {

        if (array.length <= 0 ) {
            System.out.println(Arrays.toString(array));
        } else
        {
            for (int i = 0; i < shift; i++) {

                int j;
                int last = array[array.length - 1];

                for (j = array.length - 1; j > 0; j--) {
                    //Shift element of array by one
                    array[j] = array[j - 1];
                }
                //Last element of array will be added to the start of array.
                array[0] = last;
            }
        }
        return array;
    }

}
