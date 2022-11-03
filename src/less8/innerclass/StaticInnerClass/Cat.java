package less8.innerclass.StaticInnerClass;

public class Cat  {
    int k=10;
    public  void  outclassmethod(){
        System.out.println("aouterClassMethod");
    }

    public  static class Leg {
        public void innermethod(){
            System.out.println("innerclass method");
        }
    };


}