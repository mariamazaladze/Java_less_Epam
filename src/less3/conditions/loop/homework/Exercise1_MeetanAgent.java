package less3.conditions.loop.homework;

import java.util.Scanner;

/**
 * Description
 * Please, proceed to MeetAnAgent class and write a program that:
 *
 * Asks for an input number
 * If the input equals to the secret password number, prints "Hello, Agent"
 * Otherwise, prints "Access denied"
 * Secret password is stored in final static int PASSWORD.
 * input :133976  output :Hello, Agent  / input: 711 output: Access denied
 */

public class Exercise1_MeetanAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
