package less8.innerclass.StaticInnerClass;

public class Dog extends Cat {

    public static void main(String[] args) {
        Cat.Leg obj = new Cat.Leg();
        obj.innermethod();
    }

}