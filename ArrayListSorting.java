import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Sort
{
    void Assending(ArrayList<Integer> l)
    {
        Collections.sort(l);
        System.out.println("Assending Order....");
        disp(l);
    }
    void Dessending(ArrayList<Integer>l)
    {
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Desending Order....");
        disp(l);
    }
    void disp(ArrayList<Integer> l)
    {
            System.out.println(l);
    }
}
public class ArrayListSorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter the no.of element:");
        int n=sc.nextInt();
        int a;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the number:");
            a=sc.nextInt();
            list.add(a);
        }
        Sort o= new Sort();
        System.out.println("The Array List:");
        o.disp(list);
        o.Assending(list);
        o.Dessending(list);
    }
}