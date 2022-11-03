package less55;

public class Allinitialization {
    private int a = 5;  // instans fields
    private static int b = 100; // class field

    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public Allinitialization() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section");
    }
    public static void main(String[] arg) {
//        System.out.println("Main");
//        Allinitialization obj = new Allinitialization();
//        System.out.println( b);
//        System.out.println("a=" + obj.a + " b=" + b);
    }
}
