package less3.conditions.loop.homework;

import java.util.Scanner;

/**
 * Description
 * Consider a snail travels up a tree a feet each day.
 * Then snail slides down b feet each night. Height of the tree is h feet.
 * <p>
 * Please, proceed to Snail class and write a program that prints number of days for the snail to "reach the top of the tree " .
 * Program reads a, b, h line by line. Input values are guaranteed to be positive integers.
 * If the snail cannot reach the top of the tree, print the message Impossible.
 * <p>
 * input: 4 2 14  output :6
 */
public class Exercise3_Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daySpeed = scanner.nextInt();
        int nightSpeed = scanner.nextInt();
        int treeHeight = scanner.nextInt();


        if (daySpeed > 0 && nightSpeed >= 0) {
            if (daySpeed > treeHeight) {
                System.out.println("1");
            } else if (daySpeed <= nightSpeed && daySpeed < treeHeight) {
                System.out.println("Impossible");
            } else {
                int progress = (daySpeed - nightSpeed);
                int left = treeHeight - daySpeed;
                double k = left / progress;
                int totalDay = (int) Math.ceil(k) + 1;
                if (totalDay > 0) {
                    System.out.println(totalDay);
                }
            }
        }
    }
}


//  try {


//// negative
//          if (day < 0 || night < 0 || treeHeight < 0) {
//        System.out.println("Impossible");
//        } else
//// equels Zero
//        if (day == 0 || night == 0 || treeHeight == 0) {
//        if (treeHeight == 0) {
//        System.out.println("Done");
//        } else if (day == 0 && night > day || ( night == 0 && day >= treeHeight) ) {
//        System.out.println("Impossible");
//        }
//        if (night == 0 ) {
//        double t = treeHeight / day;
//        int total = (int) Math.ceil(t);
//        System.out.println(total);
//        }
////  positive
//
//        else if (day > 0 || night > 0 || treeHeight > 0) {
//
//        if (day > treeHeight) {
//        System.out.println("1");
//        }
//        if (night >= day && day < treeHeight) {
//        System.out.println("Impossible");
//        }
//
//        else {
//        int progress = (day - night);
//        int left = treeHeight - day;
//        double k = left / progress;
//        int totalDay = (int) Math.ceil(k) + 1;
//        if (totalDay > 0) {
//        System.out.println(totalDay);
//        } else {
//        System.out.println("Impossible");
//        }
//        }
//        }
//
//
//        }
//
//        } catch(ArithmeticException e){
//        System.out.println("Impossible");
//        }
//        }