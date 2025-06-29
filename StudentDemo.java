class Student{
    private String n,i;private double c;
    void set(String n,String i,double c){this.n=n;this.i=i;this.c=c;}
    String getN(){return n;}String getI(){return i;}double getC(){return c;}
}
public class StudentDemo{
    public static void main(String[]a){
        Student s=new Student();s.set("Nazrul","E-243032",3.8);
        System.out.println(s.getN()+" "+s.getI()+" "+s.getC());
    }
}
