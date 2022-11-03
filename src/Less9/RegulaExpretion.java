package Less9;

import java.util.regex.Pattern;

public class RegulaExpretion {
    public static void main(String[] args) {
//        String text = "This is my second java 45 project.\n" +
//                "It is wonderful to learn polysemantics and arrays.\n" +
//                "The weather is cold like it should be in winter, but we are all looking forward to spring.";
//        Pattern p = Pattern.compile("\\b[\\w]{2}\\b");
//        Matcher m = p.matcher(text);
//
//        System.out.println(p);
//        System.out.println(m);

//        Pattern pm = Pattern.compile("\\w*");
//        Matcher mm = pm.matcher("*");
//        System.out.println(mm.matches());
//

//^ პრეფიქს ნიშნავს J პირველი ასო სავალდებულოდ , წერტილი და ასე შემდეგ პლიუსი ჭირდება მიმატებისას , a ნიშნაბვს ბოლო ესე უნდა მთავრდებოდეს დოლარი ბოლო მნიშნველობა
        System.out.println(Pattern.matches("^J.+a$","Java JavaScripta"));
    }

}



