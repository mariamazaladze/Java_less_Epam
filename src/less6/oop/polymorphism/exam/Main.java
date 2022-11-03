package less6.oop.polymorphism.exam;

public class Main {
    public static void main(String[] arg) {
        Shape myShape = new Square();
        myShape.draw();


        System.out.println(myShape.getClass());

        Shape triangle = new Triangle();
        triangle.draw();
        triangle.Shapemethod();
        System.out.println(triangle.getClass());


        Shape[] shapes = { new Square(), new Circle(), new Triangle() };
        for (Shape  shape : shapes) {
            shape.draw();
        }
    }
}
