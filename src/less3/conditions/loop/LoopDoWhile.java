package less3.conditions.loop;

public class LoopDoWhile {

    public static void main(String[] arg) {



        int i = 0;
        out:
        while (i < 5) {
            int j = 0;
            while (j < 2) {
                j++;
                System.out.println("i=" + i + ", j=" + j);
                break out;
            }
        }

        outer:
        while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
//        int i = 0;
//        while (true) {
//            if (i > 6) {
//                break;
//            }
//            System.out.println(i++);
//        }

    }
}
