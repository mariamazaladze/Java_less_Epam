package less6.oop.polymorphism.AAA;

public class B extends A {

     String version =  "1.0 B";
     @Override
    String testMethod() {
        return "B";
    }


    @Override
    String aa() {
        System.out.println("bb");
        return "bb";
    }
    @Override
    String bb() {
        System.out.println("overr bb");
        return "B";
    }

    String ooo() {
        System.out.println("b= over");
        return "B";
    }


}