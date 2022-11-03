package less4.arrays;

public class For_each {
    public static  void main(String[] args ){
//        int[] arrayInt = { 1, 2, 3, 4, 5, 6 };
//        for (int valueInt : arrayInt) {
//            System.out.println(valueInt);
//        }
//
//        int[]  arrayInt = { 1, 2, 3, 4, 5, 6 };
//        for (int element : arrayInt) {
//            element *=  element;
//        }
//        for (int valueInt : arrayInt) {
//            System.out.println(valueInt);
//        }
        int[] array = { 5, 10, 0, -5, 16, -2 };
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = max;
            }
            System.out.println("array[" + i + "]= "+ array[i]);
        }


    }

}
