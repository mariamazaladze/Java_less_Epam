package less55;

public class StaticMethodClass {
    static int kk;
    int n;
   static int j=5;



    public static int name(int k){
        System.out.println(k+j);
        kk=k;
        return k;
    }

    public static void main(String[] args){
        System.out.println(j);
        name(j);
        j++;
        System.out.println(j++);





    }
}
