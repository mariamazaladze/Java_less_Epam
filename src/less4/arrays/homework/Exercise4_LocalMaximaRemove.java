package less4.arrays.homework;

import java.util.Arrays;

/**
 * წაშალოს მაქიმუმები - მაქსიმუმად ითვლება ის ცვლადი რომელის ერთ ერთი მეზობელი მაინც მეტია .
 * Description
 * Please, proceed to the LocalMaximaRemove class and implement the removeLocalMaxima method.
 * The correct implementation should receive an array of int values and return a copy of a given array with
 * all local maxima removed in it. The original array must not be changed.
 * Local maximum is an element that is bigger that any of its neighbour elements.
 * You should remove elements that are local maxima in the original array.
 * Details:
 * The size of given array is guaranteed to be more than 1.
 * Given array is guaranteed to be not null.
 * If the array has no local maxima, then you should return its copy without changes.
 * You may use java.util.Arrays.* methods.
 */

public class Exercise4_LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] result = new int[array.length];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            // ind 1 and ind 1 < ind 0             OR           0 != length-1 and ind 0 <=inx 1
            //left side                     or             right side
            if ((i > 0 && array[i] <= array[i - 1]) || (i != array.length - 1 && array[i] <= array[i + 1])) {
                result[j] = array[i];
                j++;
            }
        }
        array = Arrays.copyOf(result, j);
        return array;
    }
}
