package less2.data.type;

import java.time.LocalTime;

public class ttt {


    public static void main(String args[]) {
        byte b = 1;
        int i = 3;
        byte b1 = 1 + 2;
        System.out.println(b1);
        b1 *= 2;
        b1 *= 2;
        //b = b1 + 1;   // why b1+1 is int ?

        System.out.println(b1);

        float f = 1 / 2;
        int _l = 6;

        //float f1 = 1.45;
        double d = 555d;

        System.out.println(f);
        System.out.println(i);
        //  System.out.println(f1);
        System.out.println(d);


        byte x = 5;
        byte y = 2;
        long gb = (long) x / y;
        System.out.println(gb);

        int aa = 2_147_483_647;
        float bb = aa;
        System.out.println(bb);

    }
}