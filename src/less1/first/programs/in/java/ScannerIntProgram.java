package less1.first.programs.in.java;

import java.util.Scanner;

public class ScannerIntProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);


        double numberDoable = scan.nextDouble();
        System.out.println(numberDoable);

        System.out.println("intNumber=" + number);
    }
}
