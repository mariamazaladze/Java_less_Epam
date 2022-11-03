package less14.WrapperClass;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Long {
    private DecimalFormat df;

    public static void main(String[] args) {

//   https://stackoverflow.com/questions/5540179/long-value-with-0-on-left
//        long value = 0789;
//        System.out.println("value: " + value);

//        long value = 0123450;
//        BigDecimal  df = new BigDecimal(0123450);
//        System.out.println("value: " + df);


        String input= "0888880747";
        String convert =  String.format( input);
        System.out.println(convert);
        long k= java.lang.Long.parseLong(convert);
        System.out.println(k);


        DecimalFormat df = new DecimalFormat("000000");
        System.out.println(df);
    }

}
