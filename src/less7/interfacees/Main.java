package less7.interfacees;

public class Main {
    public static void main(String[] args) {
        C c=new C();
        c.one();
        ( (A)c).one();    // cast
    }
}
