import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet:");
        String str = sc.next();
        String s= "aeiouAEIOU";
        if(s.contains(str))
        {
            System.out.println("The given alphabet is a vowel...");
        }
        else
        {
            System.out.println("The given alphabet is a consonant...");
        }
        sc.close();
    }

}
