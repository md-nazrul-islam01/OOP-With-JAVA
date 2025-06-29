class BankAccount{
    String num,name;double bal;
    static String bank="Sonali Bank";
    BankAccount(String num,String name,double bal){
        this.num=num;this.name=name;this.bal=bal;
    }
    void info(){System.out.println(num+" "+name+" "+bal);}
    static void show(){System.out.println(bank);}
}
public class BankAccountDemo{
    public static void main(String[]a){
        BankAccount a1=new BankAccount("1","Nazrul",1000);
        BankAccount a2=new BankAccount("2","Ali",500);
        BankAccount.show();
        a1.info();
        a2.info();
    }
}
