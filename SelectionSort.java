import java.util.Scanner;
class array
    {
        int a[]=new int[5];
        int smallIndex,temp;
        void sort()
        {
            int i,j;
            for( i=0;i<5;i++)
            {
                smallIndex=i;
                for(j=i+1;j<5;j++)
                {
                    if(a[smallIndex]>a[j])
                    {
                        smallIndex = j;
                    }
                }
                Swap(i,smallIndex); 
            }
            System.out.println("After Swapping");
            Display();
        }
        void Swap(int i,int j)
        {
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
        void getValue()
        {
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                System.out.printf("Enter the value of a[%d]",i);
                a[i]=sc.nextInt();
            }
            Display();
            sc.close();
        }
        void Display()
        {
            System.out.print("the array a=");
            for(int i=0;i<5;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
public class SelectionSort
{
    
    public static void main(String [] args)
    {
        array s=new array();
        s.getValue();
        s.sort();
    }
}