package less6.oop.obbjectclass;

public class Demo7 {
    public static void main(String[] arg) {
        Point point1 = new Point(5, -5);
        Point point2 = point1;
        Point point3 = new Point(5, -5);
        Point point4 = new Point(5, 5);
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        System.out.println(point1.equals(point4));
    }
}
