class Area{
    double area(double l,double w){return l*w;}
    double area(double r){return 3.1416*r*r;}
}
public class ShapeAreaDemo{
    public static void main(String[]a){
        Area a=new Area();
        System.out.println(a.area(5,3));
        System.out.println(a.area(4));
    }
}
