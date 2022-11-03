package less6.oop.objectclass;

public class Equel {

    public static void main(String[] args) {
        Student s1 = new Student(5, "mariami");
        Student s2 = new Student(5, "mariami");
        Student s3=s1;


        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
    }
}

