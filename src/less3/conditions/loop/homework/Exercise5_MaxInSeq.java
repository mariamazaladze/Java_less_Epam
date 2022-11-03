package less3.conditions.loop.homework;

import java.util.Scanner;

/**
 * Description
 * Please, proceed to FindMaxInSeq and write a program that reads a sequence of integer values from standard output and finds the maximum value. You must place your solution into the max method to pass tests.
 * <p>
 * Details:
 * You must read sequence values until the next one is 0. Zero value means end of the input sequence.
 * The sequence is guaranteed to contain at least one value.
 * input : 2 4 6 9 2 4 5 0 autput : 9
 */
public class Exercise5_MaxInSeq {

    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = -2147483648; // 	Minimum value for a variable of type int
        int currValue = 0;

        while (true) {

            currValue = scanner.nextInt();

            if (currValue == 0) {
                break;
            }
            else if (currValue > maxNumber) {
                maxNumber = currValue;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }

}
