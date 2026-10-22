import java.util.HashSet;
import java.util.Scanner;
public class HashsetRemove
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set1=new HashSet<>();
        System.out.print("Enter the no. of element:");
        int n=sc.nextInt();
        for(int i=0; i<n ;i++)
        {
            System.out.print("Enter the number:");
            int a=sc.nextInt();
            set1.add(a);
        }
        HashSet<Integer> set2=new HashSet<>();
        System.out.print("Enter the no. of element:");
        n=sc.nextInt();
        for(int i=0; i<n ;i++)
        {
            System.out.print("Enter the number:");
            int a=sc.nextInt();
            set2.add(a);
        }
        set1.removeAll(set2);
        System.out.println("After removal....");
        System.out.println(set1);
    }
}