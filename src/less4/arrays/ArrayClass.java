package less4.arrays;

public class ArrayClass {
    public static void main(String[] args) {

        // Initializing an array          Allocating memory -- of memory in the "heap" to store array elements
        int[] type1 = new int[2];   // Same   int type1[] = new int[2];
        type1[0] = 30;
        type1[1] = 31;
        type1[2] = 32;
        System.out.println(type1);

        // Initializing an array
        int[] type2 = {2, 2, 4, 5, 7, 2, 1, 1, 1};
        System.out.println(type2);

    // Anonymous arrays
        int[] daysInMonth;
        daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};



        int[] array;      //Declared a reference.
        int[] arrayInt = new int[100];  // Declared a reference and allocated memory.
        int[] amountDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };   // Declared and initialized.

    }
}
