package Less9;

public class StringClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello");
        char c = '!';
        sb.append(c);
        sb.insert(6, " Java");
//        sb.delete(5, 8);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("I like Java.");//1
        StringBuilder sb2 = new StringBuilder(sb1);//2
        System.out.println(sb1.equals(sb2));

        char[] name =new char[] {'P','a','u','l'};
        String boy = new String(name); //1
        StringBuilder sd1 =new StringBuilder("String Builder");
        String str5 =new String(sd1); //2
      //  StringBuffer sb2 =new StringBuffer("String Buffer");
        String str6 =new String(sb2);//3
        String empName =null;
    }
}
