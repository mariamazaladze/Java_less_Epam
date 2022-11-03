package less2.data.type;

public class LiteralExpressions {
    public static void main(String[] args) {
        byte var1 = -35;       // Decimal Number
        short var2 = 0b1011;   // binary Number
        int var3 = 0x51b;      // Hexadecimal Number
        int var4 = 020;        // Octal Number // int var4 = 019;   --- ( it does not work , why?)
        long var5 = 1245;      // Decimal Number
        long var6 = 0xffffL;   // Hexadecimal Number
        int var7 = 7000000;    // same var8
        int var8 = 7_000_0;    // underscore ("_") for readability - easy
        double var9 = 1.618;
        double var10 = -0.112E-05; // In exponential form         ---  ( return -1.12E-6  why?)
        float var11 = -18.456F;    //  float, after the last digit use the character F or f as a suffix:

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);
        System.out.println(var10);
        System.out.println(var11);

        char ch1 = '3';
        char ch2 = 'g';
        char ch3 = '(';
        char ch4 = '\u0034';
        char ch5 = '\u002e';
        char ch6 = '\t';     // '\t' - tabulation     -  is tab tab ?
        char ch7 = '\n';     // '\n' - new line
        char ch8 = '\r';     // '\r' - transition to the beginning of the current line
        char ch9 = '\b';     // '\b' - backspace
                             // '\f' - new page
                             // '\ddd' - octal character

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println(ch6);
        System.out.println(ch7);
        System.out.println(ch8);
        System.out.println(ch9);

        byte a = 0b0001_1110;
        System.out.println(a);

        byte b = 1_____14;
        System.out.println(b);

    }
}