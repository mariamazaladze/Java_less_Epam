package less8.innerclass.localInnerClass;

public class LoccalinnerClass {

    int k=5;
    public void met(){
        System.out.println("metth");
    }

    public void innermethod(){
        String innerfield="mmm";
        class inner {
            public void pp(){
                k=10;
//             innerfield="kkk";
                met();
                System.out.println(innerfield);
                System.out.println("kkkk");

            }
        };
    }


}
