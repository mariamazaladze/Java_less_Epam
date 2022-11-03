package less55;

import java.util.Arrays;

/**
 * ერთხელ როცა გვიწევს რამის გაკეთება , ეშვება ავტომატურად პირველი , არ შეგვილია გამოვიყენოთ returne / this keyword ები .
 */
public class StatiInitializers {
    private static char[] alph;

    static {
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }
    public static void main(String[] arg) {
        System.out.print(Arrays.toString(alph));
    }
}
