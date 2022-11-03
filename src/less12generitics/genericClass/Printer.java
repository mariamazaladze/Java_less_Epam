package less12generitics.genericClass;

public class Printer<T> {  // კლასზე ამის გაწერა იმიტო გვინდა რომ ამ კლასმა იცოდეს ესეთი ტიპი რო არსებობს მეთოდის გარეთ თუ დაგვჭირდბება ეს ტიპი.
    T a;

    public Printer(T x) {
        this.a = x;
    }

    public T sout() {
        System.out.println(a);
        return a;
    }
}
