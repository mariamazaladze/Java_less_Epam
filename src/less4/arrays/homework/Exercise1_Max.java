package less4.arrays.homework;

import java.util.Arrays;

/**
 * მასივში მაქსიმუმს ძებნა და დაბრუნება ამ რიცხვის
 * Description
 * Please, proceed to the MaxMethod class and implement the max method.
 * The correct implementation should receive an array of int values and return its maximum value.
 * Details:
 * An input array is guaranteed to not be an empty array or null.
 * Method must not modify the array.
 * Input array may contain any int value between Integer.MIN_VALUE and Integer.MAX_VALUE.
 */
public class Exercise1_Max {

    public static void main(String[] args) {
        int[] values = new int[]{-2, 0, 10, 5};
        System.out.println(max(values));
    }

    public static int max(int[] values) {
        int maxNumber = -2147483648;

        int length = values.length;
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                if (values[i] > maxNumber) {
                    maxNumber = values[i];
                }
            }
        } else {
            System.out.println("Array is Null ");
        }
        return maxNumber;
    }
}



