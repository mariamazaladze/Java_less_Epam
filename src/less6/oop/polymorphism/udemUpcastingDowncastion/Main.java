package less6.oop.polymorphism.udemUpcastingDowncastion;

public class Main {
    public static void main(String[] args) {
//UpCastion
        /*  A კლასისი ტიპის ობიექტი გვაქვს რომელიც იყენებს B კლასის overriding ტიპის მეთოდ, მაგარამ არ იყენებს სხვა მეთოდებს */
        A obj1 = new B();    // ა კლაისსი ტიპი , ბ კლასისი ობიექტი .
        obj1.start();        // ხედავს a კლასისი მეთოდებს და ბ კლასში ოვერრიდინგ მეთოდებს
        System.out.println(obj1.fil);
        System.out.println("obj1="+obj1.getClass());
        // obj1.bMethod(); -> error : ვერ ხედავს სხვა მეთოდებს

//DownCasting
        /* A კლასის ტიპის ობიექი გადავკასტეთ B კლასისი ობიექტად შესაბამისად B კლაისის ყველა მეთოდს დაინახავს უკვე  */
        A obj2=new B();       // ა კლაისსი ტიპი,  ბ კლასისი ობიექტი  .
        B bobj= (B) obj2;     // შევუცვალეთ კლასის ტიპი .
        bobj.bMethod();
        System.out.println(bobj.fil);
        System.out.println("obj="+bobj.getClass());

    }
}
