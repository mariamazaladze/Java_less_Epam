

public class Constructor {

        private String carModel;
        private  String a;
        private String b;
        private  String c;
        private Constructor(){}
    private   Constructor(String a, String b, String c){

            this.c=c;
            this.a=a;
            this.b=b;
    }
        private Constructor(String carModel) {
            this.carModel = carModel;
        }
        private   String getCarModel() {
            return carModel;
        }


        public static void main(String[] arg) {
//            Constructor сar1 = new Constructor();
//            Constructor сar2 = new Constructor("Bentley","k","bb");
//            System.out.println(сar2.b);



          //  Constructor сar3 = new Constructor("Bentley");
        //    System.out.println(сar1.getCarModel());
          //  System.out.println(сar2.getCarModel());
          //  System.out.println(сar3.getCarModel());
        }






}
