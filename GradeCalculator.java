import java.util.*;
public class GradeCalculator{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        String g;
        if(m>=80)g="A+";
        else if(m>=75)g="A";
        else if(m>=70)g="B+";
        else if(m>=65)g="B";
        else if(m>=60)g="C+";
        else if(m>=55)g="C";
        else if(m>=50)g="D";
        else g="F";
        System.out.println(g);
    }
}
