class EBank{
    private String h,n;private double b;
    void set(String h,String n,double b){this.h=h;this.n=n;this.b=b;}
    String getH(){return h;}String getN(){return n;}double getB(){return b;}
}
public class BankAccountEncapsulationDemo{
    public static void main(String[]a){
        EBank e=new EBank();e.set("Nazrul","12345",2500);
        System.out.println(e.getH()+" "+e.getN()+" "+e.getB());
    }
}
