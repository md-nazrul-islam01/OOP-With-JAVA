class Calc{
    int add(int a,int b){return a+b;}
    double add(double a,double b){return a+b;}
    int add(int...n){int s=0;for(int x:n)s+=x;return s;}
}
public class CalculatorOverload{
    public static void main(String[]a){
        Calc c=new Calc();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.5,3.5));
        System.out.println(c.add(1,2,3));
    }
}
