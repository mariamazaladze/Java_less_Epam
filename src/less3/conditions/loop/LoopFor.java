package less3.conditions.loop;

public class LoopFor {
    public static void main(String[] arg) {
        int sum = 0;
        for (int val = 1; val <= 10; val++) {
            sum += val;
        }
        System.out.println("Sum of numbers 1..10 = " + sum);


        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("\n Iteration initialization");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("Iteration completion");
        }

        int num = 1;
        for (int i = 0; i < 20; i++) {
            num++;
        }
//        while  (++num > 20) {
//            num++;
//        }
        System.out.println("num="+num);



    }
}