interface ATMService{
    void withdraw(double a);
    void deposit(double a);
    void balance();
}
class DBBL implements ATMService{
    double b;
    DBBL(double b){this.b=b;}
    public void withdraw(double a){if(a>b)System.out.println("no");else{b-=a;System.out.println(b);}}
    public void deposit(double a){b+=a;System.out.println(b);}
    public void balance(){System.out.println(b);}
}
public class ATMServiceDemo{
    public static void main(String[]a){
        DBBL d=new DBBL(5000);
        d.balance();
        d.deposit(1000);
        d.withdraw(3000);
    }
}
