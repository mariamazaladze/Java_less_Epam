package less4.arrays;

import java.util.Arrays;

public class copyOfArrays {
    public static void  main(String[]args) {
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(array));

        int[] newArray = Arrays.copyOf(array, 2);
        System.out.println(Arrays.toString(newArray));
    }

}
