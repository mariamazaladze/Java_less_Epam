package less6.oop.polymorphism;

public class Figure {
    protected double dim1;
    protected double dim2;
    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double area() {
        System.out.print("Area of the figure not determined ");
        return 0.0;
    }
}
