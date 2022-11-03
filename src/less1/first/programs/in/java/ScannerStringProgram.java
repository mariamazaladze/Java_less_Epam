package less1.first.programs.in.java;

import java.util.Scanner;

public class ScannerStringProgram {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //next() whitespace befor
        String input = scan.next();
        System.out.println("Hello  " +input);


        //nextLine() many words can read
        String input1 = scan.nextLine();
        System.out.println("Hello  " +input1);
    }

}
