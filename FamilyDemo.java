class Grandfather{void company(){System.out.println("company");}}
class Father extends Grandfather{void car(){System.out.println("car");}}
class Son extends Father{void hobby(){System.out.println("code");}}
public class FamilyDemo{
    public static void main(String[]a){
        Son s=new Son();s.company();s.car();s.hobby();
    }
}
