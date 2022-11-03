package less6.oop;

public class SuperClass {
        private int a, b;
    SuperClass(int a, int b) {
            this.a = a;
            this.b = b;
        }
    public static class Derived extends SuperClass {
        private int c;
        Derived(int a, int b, int c) {
            super(a, b);
            this.c = c;
        }
    }
    public class Demo {
        public static   void main(String[] args) {
            Derived obj = new Derived(1, 2, 3);
            System.out.println(obj);
        }
    }
}
