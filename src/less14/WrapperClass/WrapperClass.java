package less14.WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {

        Integer a1 = Integer.valueOf(500);
        Integer b1 = Integer.valueOf(500);
        /// valueof is gareshec shegvedzlo konstruqtorShi cvladi gadagveca magaram es inaxavs erti locaciaze obieqtsebs
        // tu ertnairi chanaweris sheicvals orondm - 127   dan  128 mde diaoazonshi . amitom qvevit ukve 500 ze agar edreba ertmanets .


        System.out.println(a1 == b1);         //false
        System.out.println(a1.equals(b1));    //true
//        ========================================
        Integer a = Integer.valueOf(500);
        Integer b = Integer.valueOf(500);

        System.out.println(a == b);         //false
        System.out.println(a.equals(b));    //true

        int primitiveA = a.intValue();
        int primitiveB = b.intValue();   /// ukan dabruneba primitiul tipad

        System.out.println(primitiveA);
        int k = b;
        System.out.println("k=" + k);


//        ======= String velue -  to parseing integer type .

        Integer stringToInt = Integer.parseInt("255");

        System.out.println(stringToInt);
        //  System.out.println( Integer.parseInt("k") );// ese ar shevidzlia primitiuli tipis parsingi unda gadaviyvanot wrapper classshi .

//   ======= wrapper type integer to string

        String aString = stringToInt.toString();
        System.out.println(k);

//  ======= primitiv int type to string velue .
        int a2 = 255;

        String aString2 = Integer.toString(a2);    //"255"
        System.out.println(aString2);


//        ======== Autoboxing    primitive to wrapper
        int i=5;
        Integer ii=new Integer(i);
        System.out.println(ii);

//        ======== Unboxing      wrapper to primitive
        Integer j=new Integer(88);
        int jj=j.intValue();
        System.out.println(jj);

        //===== The first two references being compared refer to the same object.
        //      The second comparison compares different objects since the ++ operation creates a new object.
        Integer y = 567;
        Integer x = y;
        System.out.print((x == y) + " ");
        x++;
        y++;
        System.out.print(x == y);
    }

}
