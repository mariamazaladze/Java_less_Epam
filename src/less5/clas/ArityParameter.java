package less55;

public class ArityParameter {
    public static void main(String[] args) {
        System.out.println(calcSum());
        System.out.println(calcSum(3));
        System.out.println(calcSum(55, 66));
        System.out.println(calcSum(77, 55, 33, 11, 99));
    }
    public static  int calcSum(int... values) {
        int res = 0;
        for (int x : values) {
            res += x;
        }
        return res;
    }





    void doItf () { }
    int doIt() { return 5; }


    String dorIt() { return "Hello!"; }
}