abstract class Shape{abstract double area();}
class CircleShape extends Shape{
    double r;CircleShape(double r){this.r=r;}
    double area(){return 3.1416*r*r;}
}
class RectShape extends Shape{
    double l,w;RectShape(double l,double w){this.l=l;this.w=w;}
    double area(){return l*w;}
}
public class AbstractShapeDemo{
    public static void main(String[]a){
        System.out.println(new CircleShape(4).area());
        System.out.println(new RectShape(5,3).area());
    }
}
