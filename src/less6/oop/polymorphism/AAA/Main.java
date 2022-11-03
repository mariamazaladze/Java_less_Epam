package less6.oop.polymorphism.AAA;

public class Main {
    public static void main(String[] args) {


        A a = new B();

        System.out.println( a.version ) ;
        a.aa();
        a.ooo();


//        System.out.println(a.version + a.testMethod());
//
//
//        B b = new B();
//        b.ooo();
//
//        b.bb();
//
//        A aa = new A();
//        aa.aa();
//
//        A ab = new B();
//        ab.aa();
//        ab.bb();
//        System.out.println(ab.bb());
//        ab.aa();

    }
}
