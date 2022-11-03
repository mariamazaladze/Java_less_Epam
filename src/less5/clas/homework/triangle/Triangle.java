package less55.homework.triangle;

import java.util.Arrays;

public class Triangle {
    final private double ax;
    final private double ay;
    final private double bx;
    final private double by;
    final private double cx;
    final private double cy;

    public Triangle(less55.homework.triangle.Point a, less55.homework.triangle.Point b, less55.homework.triangle.Point c) {

        this.ax = a.getX();
        this.ay = a.getY();

        this.bx = b.getX();
        this.by = b.getY();

        this.cx = c.getX();
        this.cy = c.getY();
    }

    public double area() {

        double[] A = new double[]{ax, ay};
        double[] B = new double[]{bx, by};
        double[] C = new double[]{cx, cy};

        if (Arrays.equals(A, B) || Arrays.equals(A, C) || Arrays.equals(B, C)) {
            throw new IllegalArgumentException();
        } else {
            double abLineLength = Math.abs(A[0] - B[0]);
            double acLineLenght = Math.abs(A[1] - C[1]);

            if (abLineLength <= 0 || acLineLenght <= 0) {
                throw new IllegalArgumentException();
            } else {

                System.out.println("AB=" + abLineLength);
                System.out.println("acLineLenght=" + acLineLenght);
//            double BC = Math.sqrt(Math.pow(AB, 2) + Math.pow(acLineLenght, 2)); // pitagora
//            System.out.println("BC=" + BC);

                double area = 0.5 * (abLineLength * acLineLenght);
                System.out.println("result=" + area);
                return area;
            }
        }
    }

    public less55.homework.triangle.Point centroid() {
        System.out.println("ss");
        return new less55.homework.triangle.Point(ax, ay);
    }
}
