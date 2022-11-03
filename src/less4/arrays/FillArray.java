package less4.arrays;

import java.util.Arrays;

public class FillArray {
    public static void  main(String[]args){
        int [] aa=new int[10];
        Arrays.fill(aa,0,2,3);
        System.out.println(Arrays.toString(aa));

    }
}
