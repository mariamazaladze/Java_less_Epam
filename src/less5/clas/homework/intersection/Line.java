
package less5.clas.homework.intersection;


public class Line {
    private int k;
    private int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }
    public less55.homework.intersection.Point intersection(Line other) {
        if ((other.k - this.k) == 0) {
            return null;
        }else {
            int crossX = (this.b - other.b) / (other.k - this.k);
            int crossY = (this.k * crossX + this.b);

            return new less55.homework.intersection.Point(crossX,crossY);
        }
    }
}
