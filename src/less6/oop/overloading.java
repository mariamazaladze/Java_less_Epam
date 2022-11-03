package less6.oop;

public class overloading {

   private int i = 0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    overloading(byte b) {
        System.out.println("Good day employee!");
    }

    overloading(long i) {
        System.out.println("Good night employee!");
    }



    public static void main(String[] args) {
        overloading e = new overloading(2);
        String message = "The current position is = " + e;

    }

    @Override
    public String toString() {
        return "overloading{" +
                "i=" + i +
                '}';
    }
}
