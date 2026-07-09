import java.util.Scanner;
public class NumberSeries
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the end number of the series:");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++)
        {
            System.out.printf("%d ",i);
        }

    }
}

