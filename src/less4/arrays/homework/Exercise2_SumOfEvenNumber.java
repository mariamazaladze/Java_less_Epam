package less4.arrays.homework;

/**
 * ლუწების ჯამის დაბრუნება.
 * Description
 * Please, proceed to the SumOfEvenNumbers class and implement the sum method.
 * The correct implementation should receive an array of int values and return the  "  sum of even numbers " .
 * Details:
 * If given array is null or empty, method returns 0.
 * sum method must not modify the array.
 * Input array may contain any int value between Integer.MIN_VALUE and Integer.MAX_VALUE.
 **/
public class Exercise2_SumOfEvenNumber {
    public static void main(String[] args) {
        int[] values = new int[]{1, 3, 2, 8, 15, 199};
        System.out.println( sum(values));
    }

    public static int sum(int[] array) {
        int result = 0;
        if (array == null) {
            System.out.println(0);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    result += array[i];
                }
            }
        }
        return result;
    }

}
