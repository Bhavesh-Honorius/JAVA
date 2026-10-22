import java.util.Scanner;
public class SumOfNaturalNumber{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,sum;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        sum=(n*(n+1))/2;
        System.out.println("The sum of "+n+"natural numbers is :"+sum);
        sc.close();
    }
}
