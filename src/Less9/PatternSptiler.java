package Less9;

import java.util.regex.Pattern;

public class PatternSptiler {
    public static void main(String[] args) {
        String str1 = "One two,three!four;five six.seven";
        Pattern p1 = Pattern.compile("[;  ,!.]");
        String s[] = p1.split(str1);
        System.out.println("Source string  -> " + str1);
        for (String i : s) {
            System.out.println("Lexeme: " + i);
        }
    }
}
