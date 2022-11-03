package less7;

public abstract class Car {
    public boolean getInfo(){
        go();
        stop();
        capastityDrive();
        coutCilindr();
        return true;
    }
    public abstract void go();

    public abstract void stop();

    protected  int k;
    public void fly() {
        System.out.println("yyy");
    }


    public abstract void capastityDrive();
    public  abstract void coutCilindr();


}
