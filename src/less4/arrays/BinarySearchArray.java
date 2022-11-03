package less4.arrays;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args){
        int intArr[] = {10, 15, 18, 10, 55, 27, 38, 39, 51, 55, 55, 57, 61, 66, 83, 95};
        int searchVal = 10;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println(retVal);

    }
}
