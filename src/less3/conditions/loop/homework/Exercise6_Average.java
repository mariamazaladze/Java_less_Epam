package less3.conditions.loop.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description
 * Please, proceed to Average class and write a program that reads a sequence of integer values from standard input and finds the average value.
 * <p>
 * Details:
 * <p>
 * You must read sequence values until the next one is 0. Zero value means end of the input sequence.
 * The sequence is guaranteed to contain at least one value.
 * Average value is also an integer. Use integer operations.
 * <p>
 * input : 1 2 3 4 5 0  autput : 3
 */
public class Exercise6_Average {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input ;
        int sum = 0;
        int iter = 0;

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
            iter++;
        }
        int  average =  sum / iter;
        System.out.println(average);
    }


}
