package less6.oop.polymorphism.cat;

public class Main {
    public static void main(String[] arg) {
        Cat cat = new BritishCat();
     //   PersianCat cat3 = (PersianCat)cat;

        System.out.println(cat.getClass());
        PersianCat cat3 = (PersianCat)cat;
    }
}
