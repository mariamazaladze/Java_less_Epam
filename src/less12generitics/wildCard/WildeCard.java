package less12generitics.wildCard;

import less12generitics.Generitcs;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class WildeCard {
    public static void main(String[] args) {

        List<Integer> c = new ArrayList<>();
        c.add(5);
        printer(c);
        List<String> c2 = new ArrayList<>();
        c2.add("Mariami");
        printer(c2);


        Generitcs<Double> d=new Generitcs<>();
        printer2(d);
    }

    public static void printer (List < ? > anyObj){ /// ar vicit romeli class obieqti iqneba , anu ? vwert
        System.out.println(anyObj);
    }
    public static void printer2 (Generitcs < ? > anyObj){ /// ar vicit romeli class obieqti iqneba , anu ? vwert
        System.out.println(anyObj);
    }
}
