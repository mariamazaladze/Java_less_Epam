package less4.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copyingArrays {
    public static void main(String[] args) {

        int [] to = {1, 2, 3, 4,5};
        int from[] = {10, 11, 12, 13, 14, 15};
        System.arraycopy(to,0,from,2,3);
                        // რის , რომელიდან ... სად რომლიდან , რამდენით
        System.out.println(Arrays.toString(to));   // Arrays.toString ამის გარეშე ვერ წაიკითხავ arrays .
        System.out.println(Arrays.toString(from));


    }

}
