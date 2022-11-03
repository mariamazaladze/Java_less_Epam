package less8.innerclass.AnonumysClass;

public class Animal {
    int k=15;
    public void voic(){
        System.out.println("voise");
    }

    public static void main(String[] args) {


    Dog mydog=new Dog(){
        @Override
        public void hep(){
            System.out.println("not hep");
        }
    };

    mydog.hep();
//-----------------------------------------//ineterface
    Interface inter=new Interface() {
        @Override
        public void it() {
            System.out.println("okokoo");
        }
    };
        inter.it();


}}
