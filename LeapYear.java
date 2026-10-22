<<<<<<< HEAD
import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year:");
        int year=sc.nextInt();
        if((year % 400 == 0)||(year %4 ==0 && year % 100 !=0))
        {
            System.out.println(year +" is a leap year");
        }
        else
        {
            System.out.println(year +" is not a leap year");
        }
        sc.close();
    }
}
=======
import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year:");
        int year=sc.nextInt();
        if((year % 400 == 0)||(year %4 ==0 && year % 100 !=0))
        {
            System.out.println(year +" is a leap year");
        }
        else
        {
            System.out.println(year +" is not a leap year");
        }
        sc.close();
    }
}
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
