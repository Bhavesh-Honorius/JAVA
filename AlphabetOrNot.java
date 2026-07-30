import java.util.Scanner;
public class AlphabetOrNot{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        char alphabet;
        System.out.println("Enter the alphabet:");
        alphabet = sc.next().charAt(0);
        if(Character.isAlphabetic(alphabet))
        {
            System.out.println("It is a alphabet");
        }
        else
        {
            System.out.println("It is not a alphabet");
        }
        sc.close();
    }
}