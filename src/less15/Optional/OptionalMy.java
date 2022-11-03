package less15.Optional;

import java.util.Optional;
import java.util.OptionalInt;

// Optaonal class Null ფოინტერექსეფშნეს აზღვევს. methods ==== Of()   ofNullable()   empty()
// An object of the Optional type can be created using a static factory method: Optional.of(), Optional.ofNullable(), or Optional.empty().



public class OptionalMy<D extends Number> {
    //standart method .
    private static int sum(int[] array){
        int sum=0;
        for (int element:array) {
            sum+=element;
        }
        return sum;
    }

/// aq vazgvevt null shemtxvevas , magaram jobia meore metodi
    private static Optional<Object> sumOps(int[] array){
        Optional<Object> result;
        if(array==null || array.length<=0){
            result = Optional.empty();
        }else {
            double sum=sum(array);
            result=Optional.of(sum);
        }
        return result;
    }

// aq scenari ufro swori struqturitaa ( body moqmedebis radgan didia ufro else shi gagvaqvs dazgvevaa .
    private static Optional sumOps2(int[] array){
            Optional result = Optional.ofNullable(array);
            if( result.isPresent() &&  array.length >0){
                int sum=sum(array);
                return Optional.of(sum);
            }else {
                return  Optional.empty();
            }
    }


    public static void main(String[] args) {
      int []  array= null;
//        int []  array= {1,2,3};
//        sum(array);
//        System.out.println(sum(array));

//        sumOps(array);
//        System.out.println(sumOps(array));


        sumOps2(array);
        System.out.println(sumOps2(array));
//        Optional<Double> l = sumOps2(array);
//        l.get();
    }


}
