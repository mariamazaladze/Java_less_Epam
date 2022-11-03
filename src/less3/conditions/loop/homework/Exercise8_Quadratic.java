package less3.conditions.loop.homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * Description
 * Please, proceed to the Quadratic Equation class and implement a program to solve quadratic equations.
 * For the given " quadratic equation" coefficients (ax² + bx + c = 0),
 * return one or two roots of the equation if there is any in the set of real numbers.
 * Input value is given via System.in. Output value must be printed to System.out.
 * Output format is:
 * "x₁ x₂" (two roots in any order separated by space) if there are two roots
 * "x" (just the value of the root) if there is the only root
 * "no roots" (just a string value "no roots") if there is no root
 * The parameter is guaranteed to be not zero.
 * Hint: Quadratic formula reference
 * input : 1 -2 1 autput : 1
 */
public class Exercise8_Quadratic {
    public static void main(String[] args) {
        // (ax² + bx + c = 0)
        // https://www.rapidtables.com/math/algebra/Quadratic_equation.html
        // https://infimani.wordpress.com/2013/11/15/%E1%83%99%E1%83%95%E1%83%90%E1%83%93%E1%83%A0%E1%83%90%E1%83%A2%E1%83%A3%E1%83%9A%E1%83%98-%E1%83%92%E1%83%90%E1%83%9C%E1%83%A2%E1%83%9D%E1%83%9A%E1%83%94%E1%83%91%E1%83%98%E1%83%A1-%E1%83%90%E1%83%9B/

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = (b * b) - (4 * a * c);

        if (d > 0.0) {
            double r1 = (-b - Math.sqrt(d))/ (2.0 * a);
            double r2 = (-b + Math.sqrt(d)) / (2.0 * a);
            System.out.println(r1 + " " + r2);

        }
        else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            if (r1 == -0.0) {
                r1 = 0.0;
            }
            System.out.println(r1);
        } else {
            System.out.println("no roots");
        }
    }

}
