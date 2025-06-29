import java.util.*;
public class SimpleCalculator{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        double x=s.nextDouble();
        double y=s.nextDouble();
        char op=s.next().charAt(0);
        double r=0;
        if(op=='+')r=x+y;
        else if(op=='-')r=x-y;
        else if(op=='*')r=x*y;
        else if(op=='/')r=y==0?0:x/y;
        else System.out.println("Err");
        System.out.println(r);
    }
}
