package less4.arrays;

import java.util.Arrays;

public class Equvalent {
    public static void  main (String [] args ){
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(arr1 == arr2); // binarulad anu misamartebiT adarebs
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
    }
}
