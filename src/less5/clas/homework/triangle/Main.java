package less55.homework.triangle;

public class Main {
    public static void main(String[] args) {
        // 1 wyvero/vertices            2 wyvero           3 wyvero
        double area = new less55.homework.triangle.Triangle(new less55.homework.triangle.Point(0, 0), new less55.homework.triangle.Point(3, 0), new less55.homework.triangle.Point(0, 4)).area();
        System.out.println(area);



        less55.homework.triangle.Point centroid = new less55.homework.triangle.Triangle(new less55.homework.triangle.Point(0, 0), new less55.homework.triangle.Point(3, 0), new less55.homework.triangle.Point(0, 3)).centroid();
        System.out.println(centroid.getX());
        System.out.println(centroid.getY());

    }
}
