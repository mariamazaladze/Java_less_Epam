package less7.interfacees;

public class C implements A,B{
    @Override
    public String one() {
        System.out.println("one implemenation = "+ B.k);
        return "ar vici";
    }
}
