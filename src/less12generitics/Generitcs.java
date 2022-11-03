package less12generitics;

public class Generitcs <T> {

    public static void main(String[] args) {
        met("mari",2.12, 2);
        met("azaladze");
        met(1991);
    }
    static <T> void met(T... s) {   // მეთოდის შეგნი <T> აღნიშვნა საჭიროა მაშინ როცა კლასი არ არის ჯენერიკის ტიპის
        for (int i = 0; i < s.length; i++) {
            System.out.println(i + " = " + s[i].toString());
        }
    }
}
