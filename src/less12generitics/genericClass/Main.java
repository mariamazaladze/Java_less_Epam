package less12generitics.genericClass;


import less12generitics.genericClass.Printer;

public class Main {


    public static void main(String[] args) {

        Printer<Double> doub = new Printer<>(10.1);
        doub.sout();

        Printer<String> str =new Printer<>("mariami ");
        str.sout();

        Printer aa= new Printer(5);    /// raw Type
        System.out.println(aa);
    }
}
