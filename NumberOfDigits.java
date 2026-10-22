<<<<<<< HEAD
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter the number:");
        n= sc.nextInt();
        for(;n!=0;n=n/10)
        {
            count ++;
        }
        System.out.println("Number of digits "+count);
        sc.close();
    }
}
=======
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter the number:");
        n= sc.nextInt();
        for(;n!=0;n=n/10)
        {
            count ++;
        }
        System.out.println("Number of digits "+count);
        sc.close();
    }
}
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
