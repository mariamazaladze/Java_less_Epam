package less3.conditions.loop.homework;

import java.util.Scanner;

/**
 * Description
 * Please, proceed to PizzaSplit class. The program must read two values from System.in:
 * <p>
 * Number of people 12
 * Number of pieces per pizza -8
 * It is guaranteed that this values are positive integers.
 * <p>
 * Then the program must print the minimum number of pizzas (not zero)
 * so that everyone has an equal number of slices and no slice is left.
 * input :  12 8 output : 3
 */
public class Exercise7_PizzaSplit {
    public static void main(String[] args) {
        // Algoritme  ( piecesPizza * ?  ) % people  = 0     //  უსჯ LCM (least common multiple)
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int piecesPizza = scanner.nextInt();

        if (piecesPizza == 0 || people == 0) {
            System.out.println("0");
        }
        int i = 1;
        int k;
        do {
            int kk = (i * piecesPizza) % people;
            System.out.println(kk);
            k = kk;
            i++;
        } while (k != 0);
        System.out.println(i - 1);

    }

}
