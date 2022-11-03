package less2.data.type;

import java.time.LocalTime;

public class Operator {

        public static void main(String[] args){
            int experience = 5;
            int requirements = 10;
            String result = (experience > requirements) ? "Accept to project" : "Learn more" ;
            System.out.println( result );



            int max = Math.max(3, 4);
            System.out.println(max);

            // now time
            LocalTime t = LocalTime.now();
            System.out.println(t);

            //PI
            double pi=Math.PI;
            System.out.println(pi);
            // E
            double e=Math.E;
            System.out.println(e);
            //random
            double random=Math.random();
            System.out.println(random);

            System.out.println(010 | 4 );

            System.out.println("2 + 2 = " + 2 + 2);

            byte b3 = 50;
            int iVal = -100;
            b3 += --iVal;
            System.out.println(b3);

            byte bw = 100 + 27;
            System.out.println(bw);


            final byte X = 7;
            int y = 12 + X;
            System.out.println(y);


        }
}