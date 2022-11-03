package less12generitics.genericMethod;


import less12generitics.Generitcs;

public class GenericMethod<V> {

      //multy paraams
      public static   <T,V >  T  m(T a,V b ){
            System.out.println(a);
            System.out.println(b);
            return a;
      }

      // new method
      private  V par;
      GenericMethod (V par){
          this.par=par;
      }
      public static <V> GenericMethod<V> name (V value){
            return  new GenericMethod<>(value);
      }

}
