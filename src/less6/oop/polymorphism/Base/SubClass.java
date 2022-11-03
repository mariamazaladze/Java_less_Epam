package less6.oop.polymorphism.Base;

public class SubClass extends SupeerClass {

//    @Override
    public void print() {
        System.out.println("SubClassmethod");
    }

    public void SubClassmethod1() {
        System.out.println("SubClassmethod");
    }

    public void SubClassmethod() {
        System.out.println("SubClassmethod");
    }


    public static void over(int a){
        System.out.println("subclass="+a);
    }
}
