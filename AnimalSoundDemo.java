class Animal{void sound(){System.out.println("sound");}}
class Dog extends Animal{void sound(){System.out.println("bark");}}
class Cat extends Animal{void sound(){System.out.println("meow");}}
public class AnimalSoundDemo{
    public static void main(String[]a){
        new Animal().sound();
        new Dog().sound();
        new Cat().sound();
    }
}
