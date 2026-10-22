import java.util.Scanner;
public class QuadraticSolution{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        double r1,r2;
        System.out.println("Enter the coefficient of the quadratic equation ax^2 +bx +c:");
        System.out.println("a=");
        a=sc.nextInt();
        System.out.println("b=");
        b=sc.nextInt();
        System.out.println("c=");
        c=sc.nextInt();
        d= (b*b) -(4*a*c);
        if(d>0)
        {
            r1 = ((-b)+(Math.sqrt(d)))/(2*a);
            r2 = ((-b)-(Math.sqrt(d)))/(2*a);
            System.out.println("the roots of the quadratic equation are x="+r1+"and x="+r2);
        }
        else if(d==0)
        {
            r1= -b/(2*a);
            System.out.println("the roots of the quadratic equation are x="+r1+"and x="+r1);
        }
        else
        {
            double real,imaginary;
            real=(-b)/(2*a);
            imaginary=(Math.sqrt(-d))/(2*a);
            System.out.println("the roots of the quadratic equation are x="+real+"+("+imaginary+")i \n x="+real+"-("+imaginary+")i");
        }
        sc.close();
    }
}
    

