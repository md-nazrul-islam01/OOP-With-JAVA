import java.util.*;
public class EvenNumbersArray{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        int st=s.nextInt(),en=s.nextInt();
        int[] arr=new int[en-st+1];
        int k=0;
        for(int i=st;i<=en;i++)if(i%2==0)arr[k++]=i;
        for(int i=0;i<k;i++)System.out.print(arr[i]+" ");
    }
}
