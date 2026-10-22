import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileRead 
{ 
    public static void main(String[] args) {
        try
        {
        	File f = new File("myfile.txt");
            Scanner sc= new Scanner(f);
            while(sc.hasNextLine())
            {
                String data= sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        	System.out.println("HI! this is codded with Java!!!!!!!");
        }
        catch(IOException e)
        {
            System.out.println("An error has occurred."+e);
        }
    }
}