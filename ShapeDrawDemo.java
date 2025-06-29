class Shape{void draw(){System.out.println("shape");}}
class Circle extends Shape{void draw(){System.out.println("circle");}}
class Rectangle extends Shape{void draw(){System.out.println("rect");}}
public class ShapeDrawDemo{
    public static void main(String[]a){
        new Shape().draw();
        new Circle().draw();
        new Rectangle().draw();
    }
}
