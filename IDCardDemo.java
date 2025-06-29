class IDCard{
    String n,i,d,c;
    IDCard(String n,String i,String d,String c){
        this.n=n;this.i=i;this.d=d;this.c=c;
    }
    void show(){
        System.out.println(n+" "+i+" "+d+" "+c);
    }
}
public class IDCardDemo{
    public static void main(String[]a){
        new IDCard("Nazrul","E-243032","CCE","IIUC").show();
    }
}
