package less14.WrapperClass;

import less7.interfacees.B;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class wrapperWithDouble {
    public static void main(String[] args) {
        //=== primitive double
        double d1=0.3;
        double d2=0.1;
        double res=d1-d2;
        System.out.println(res);

        //== BigDecimal
        BigDecimal b1=new BigDecimal(0.3);
        BigDecimal b2=new BigDecimal(0.1);
        BigDecimal result = b1.subtract(b2);
        System.out.println(result);

        // bigDecimal corectly operation
        BigDecimal b3=new BigDecimal(0.3);
        BigDecimal b4=new BigDecimal(0.1);
        BigDecimal resulte = b3.subtract(b4);
        System.out.println(resulte.setScale(3, RoundingMode.HALF_EVEN));
    }
}
