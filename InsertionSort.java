<<<<<<< HEAD
import java.util.Scanner;
public class InsertionSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the Size of array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for (i=0;i<n; i++)
        {   
            a[i]=sc.nextInt();
        }
        Sort obj=new Sort();
        obj.insert(a,n);
        sc.close();
    }
}
class Sort 
{
    void insert(int a[],int n)
    {
        int i,j,key;
        for(i=1;i<n;i++)
        {
            key=a[i];
            j=i-1;
            while(j>=0&&a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("The sorted array");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");    
        }
            
    }
}
=======
import java.util.Scanner;
public class InsertionSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the Size of array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for (i=0;i<n; i++)
        {   
            a[i]=sc.nextInt();
        }
        Sort obj=new Sort();
        obj.insert(a,n);
        sc.close();
    }
}
class Sort 
{
    void insert(int a[],int n)
    {
        int i,j,key;
        for(i=1;i<n;i++)
        {
            key=a[i];
            j=i-1;
            while(j>=0&&a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("The sorted array");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");    
        }
            
    }
}
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
