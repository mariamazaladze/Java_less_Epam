package less6.oop.polymorphism.instanceof1;

public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        System.out.println("category: " + current.getCategory() );
        String tr ="maa";
        if(current instanceof CarInsurance)
        {
            System.out.println("rrrrr");
        }



//        System.out.println("category: " + CarInsurance.getCategory() );
    }
}
