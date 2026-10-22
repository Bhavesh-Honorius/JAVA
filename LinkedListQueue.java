import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListQueue
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> queue=new LinkedList<>();
        boolean l=true;
        while(l)
        {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Exit");
            System.out.print("Enter your choise:");
            int c=sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter the number to enqueue:");
                    int e=sc.nextInt();
                    queue.addLast(e);
                    System.out.println(queue);
                    break;
                case 2:
                    queue.removeFirst();
                    System.out.println(queue);
                    if(queue.isEmpty())
                    {
                        System.out.println("Queue underflow");
                    }
                    break;
                case 3:
                    l=false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        sc.close();
    }
}