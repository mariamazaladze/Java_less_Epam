package less6.oop.polymorphism;

public class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    public double area() {
        System.out.print("Area of the rectangle ");
        return dim1 * dim2;
    }
}
