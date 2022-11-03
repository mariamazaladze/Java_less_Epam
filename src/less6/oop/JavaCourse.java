package less6.oop;

import java.util.Arrays;

public class JavaCourse {



    String courseName = "Java";
    static int i;


    public static void main(String[] args) {
        JavaCourse courses[] = {new JavaCourse(), new JavaCourse()};
        System.out.println(i);
        System.out.println(i);
        System.out.println(courses[0]);
        System.out.println(courses[1]);
        courses[0].courseName = "MegaCourse";
        for (JavaCourse c : courses) {
            c = new JavaCourse();
        }
        for (JavaCourse c : courses) {
            System.out.println(c.courseName);
        }
    }

}
