package less3.conditions.loop.homework;

import java.util.Scanner;

/**
 * Description
 * Please, proceed to HelloStrangers class and write a program that:
 *
 * Asks for a number - amount of strangers to meet
 * Then reads stranger names line by line
 * And, finally, prints line by line "Hello, stranger name" for each stranger
 * It is guaranteed that the input is not null. It is guaranteed that the input of strangers count is int number.
 *
 * Consider special cases:
 *
 * If strangers count is zero, then program must print "Oh, it looks like there is no one here".
 * If strangers count is negative, then program must print "Seriously? Why so negative?".
 * input: 3 Athos Porthos Aramis output: 0   / input:0 autput : Oh, it looks like there is no one here
 */
public class Exercise2_HelloStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberAmount = scanner.nextInt();

        if (numberAmount > 0) {
            for (int i = 0; i < numberAmount; i++) {
                Scanner scanner1 = new Scanner(System.in);
                String strangerName = scanner1.nextLine();
                System.out.println("Hello, " + strangerName);
            }
        } else if (numberAmount == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
        // also : else if (numberAmount<0) { System.out.println("Seriously? Why so negative?"); }
    }
}
