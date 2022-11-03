package less6.oop.polymorphism.Base;


public class Main {


    public static void main(String[] args) {
        SupeerClass object = new SubClass();


//        SubClass kk= (SubClass) object;



        object.print();




//        object.teBase();
        System.out.println( object.getClass());

        SubClass obn=new SubClass();
        obn.over(1);
        obn.over("mariami");





    }


}
