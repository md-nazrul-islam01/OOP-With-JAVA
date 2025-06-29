import java.util.*;
public class PrimeNumbersArray{
    static boolean p(int n){
        if(n<2)return false;
        for(int i=2;i*i<=n;i++)if(n%i==0)return false;
        return true;
    }
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        int st=s.nextInt(),en=s.nextInt();
        int[] arr=new int[en-st+1];
        int k=0;
        for(int i=st;i<=en;i++)if(p(i))arr[k++]=i;
        for(int i=0;i<k;i++)System.out.print(arr[i]+" ");
    }
}
