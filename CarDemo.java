class Car{
    String b,m;double p;
    Car(String b,String m,double p){this.b=b;this.m=m;this.p=p;}
    void show(){System.out.println(b+" "+m+" "+p);}
}
public class CarDemo{
    public static void main(String[]a){
        new Car("Toyota","Corolla",20000).show();
    }
}
