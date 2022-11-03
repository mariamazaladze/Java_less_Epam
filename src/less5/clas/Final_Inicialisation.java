package less55;

public class Final_Inicialisation {
    private final int XX = 50;
    private final int ZZ;
    private final int YY;


    {
        ZZ = 20;
        System.out.println("Dynamic section");
    }
    public Final_Inicialisation() {
        YY = 30;
        System.out.println("Constructor");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        Final_Inicialisation obj = new Final_Inicialisation();
    }
}
