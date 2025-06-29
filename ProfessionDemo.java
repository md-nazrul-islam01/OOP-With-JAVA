class Person{void info(){System.out.println("person");}}
class Doctor extends Person{void work(){System.out.println("treat");}}
class Teacher extends Person{void work(){System.out.println("teach");}}
class Engineer extends Person{void work(){System.out.println("design");}}
public class ProfessionDemo{
    public static void main(String[]a){
        new Doctor().work();
        new Teacher().work();
        new Engineer().work();
    }
}
