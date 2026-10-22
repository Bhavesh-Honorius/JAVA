interface iShape
{
    public void printArea(int data1,int data2);
}
class iRectangle implements iShape
{
    @Override
    public void printArea(int data1,int data2)
    { 
        System.out.println("Area of rectange is: "+(data1+data2));
    }
}
class iCircle implements  iShape
{
    @Override
    public void printArea(int data1,int data2)
    {
        System.out.println("Area of circle is: "+(3.14*data1*data1));
    }
}
class iTriangel implements  iShape
{
    @Override
    public void printArea(int data1,int data2)
    {
        System.out.println("Area of triangle is: "+(0.5*data1*data2));
    }
}
public class AreaOfShapesInterface
{
    public static void main(String[] args) 
    {
        int data1,data2;
        iShape s=new iRectangle();
        data1=10;
        data2=20;
        s.printArea(data1,data2);
        s=new iCircle();
        data1=40;
        s.printArea(data1,data2);
        s=new iTriangel();
        data1=30;
        data2=50;
        s.printArea(data1,data2);    
    }
}