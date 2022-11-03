package Less9;

public class Strinng {
    public static void main(String[] args) {
        String k = "mariam azaladze";

        //charAt ინდექსის მქონდე მნიშვნელობის დაბრუნება
        System.out.println(k.charAt(2));

        //endsWith() ბოლო ესე მთავრდება თუ არა
        System.out.println(k.endsWith("dze"));

        //equalsIgnoreCase()  არაქეისსენსიტივი
        System.out.println(k.equalsIgnoreCase("Mariam Azaladze"));

        //indexOf() index აბრუნებს პირველივე სადაც შეხვდება ეს char ი  last აბრუნებს ბოლოდან მოყოლებული თი ვერ მოძებნა -1 აბრუნებს
        System.out.println(k.indexOf('a'));
        System.out.println(k.lastIndexOf('a'));

        //repeat() იმეორებს
        System.out.println(k.repeat(2));

        //substring () დაჭრა
        System.out.println(k.substring(2 )) ;
        System.out.println(k.substring(2,5));

        System.out.println(k.trim());

        //replace() ჩანაცვლება
        System.out.println(k.replace('m','2'));


        String formatString = "We are printing double variable (%f), string (\"%s\") and integer variable (%d).";
        System.out.println(String.format(formatString, 0.7, "Java", 10));


        String kk ="mariami kkk %b";
        System.out.println(String.format(kk, 5>20));

    }
}
