package less10Exception;

import java.io.FileNotFoundException;

public class NestedTry {
    static Exception exception = new FileNotFoundException();

    public static void main(String[] args) {
        try {
            meth();
        } catch (Exception e) {
            System.out.println("main");

        }
    }

    public static void meth() throws Exception {
        try {
            throw exception;
        } catch (Exception e) {
//            throw e; -- ქეჩი დააბრუნებს და ისვრის e ექსეფშენის ობიექტს მაშინ main ში catch გაივლის მაინც ,
            System.out.println("methoddd");

        }
    }
}
