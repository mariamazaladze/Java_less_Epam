package less3.conditions.loop.homework;

import java.util.Scanner;

/**
 * Description
 * Consider a company of friends visiting a restaurant. They decided to equally split the bill.
 * <p>
 * Friends decided to add 10 percent of the bill total amount as tips. Then they cover the total payment in equal parts.
 * <p>
 * Please, proceed to GoDutch class and write a program that reads a bill total amount and a number of friends, and then prints part to pay.
 * <p>
 * Consider some details:
 * <p>
 * Program must read data from System.in.
 * Bill total amount cannot be negative. If input value is negative, the program stops, printing: Bill total amount cannot be negative.
 * Number of friends cannot be negative or zero. If input value is, then the program stops, printing: Number of friends cannot be negative or zero.
 * Bill total amount, number of friends and part to pay are integers.
 * input : 1000 5 Output : 220
 */
public class Exercise4_GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int friends = scanner.nextInt();

        if (bill == 0) {
            System.out.println("0");
        }
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        }
        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        }
        if (bill > 0 && friends > 0) {
            int addPercent = bill + (bill * 10 / 100);
            // System.out.println(addPercent);  --
            int a = Math.round(addPercent / friends);
            System.out.println(a);
        }

    }
}
