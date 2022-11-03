package less8.innerclass.innerClass;

public class Main {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.outclassmethod();

        OuterClass.Ineer o = outer.new Ineer(); // innerclass instance
        o.innermethod();

    }
}
