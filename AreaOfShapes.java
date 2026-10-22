<<<<<<< HEAD
abstract class Shape
{
    int data1,data2;
    abstract void printArea();
}
class Rectangle extends Shape
{
    @Override
    void printArea()
    {
        System.out.println("Area of rectange is: "+(data1+data2));
    }
}
class Circle extends Shape
{
    @Override
    void printArea()
    {
        System.out.println("Area of circle is: "+(3.14*data1*data1));
    }
}
class Triangel extends Shape
{
    @Override
    void printArea()
    {
        System.out.println("Area of triangle is: "+(0.5*data1*data2));
    }
}
public class AreaOfShapes
{
    public static void main(String[] args) 
    {
        Shape s=new Rectangle();
        s.data1=10;
        s.data2=20;
        s.printArea();
        s=new Circle();
        s.data1=40;
        s.printArea();
        s=new Triangel();
        s.data1=30;
        s.data2=50;
        s.printArea();    
    }
=======
abstract class Shape
{
    int data1,data2;
    abstract void printArea();
}
class Rectangle extends Shape
{
    @Override
    void printArea()
    {
        System.out.println("Area of rectange is: "+(data1+data2));
    }
}
class Circle extends Shape
{
    @Override
    void printArea()
    {
        System.out.println("Area of circle is: "+(3.14*data1*data1));
    }
}
class Triangel extends Shape
{
    @Override
    void printArea()
    {
        System.out.println("Area of triangle is: "+(0.5*data1*data2));
    }
}
public class AreaOfShapes
{
    public static void main(String[] args) 
    {
        Shape s=new Rectangle();
        s.data1=10;
        s.data2=20;
        s.printArea();
        s=new Circle();
        s.data1=40;
        s.printArea();
        s=new Triangel();
        s.data1=30;
        s.data2=50;
        s.printArea();    
    }
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
}