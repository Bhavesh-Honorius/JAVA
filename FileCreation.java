import java.io.File;
import java.io.IOException;
public class FileCreation 
{ 
    public static void main(String[] args) {
        try
        {
        	File obj = new File("myfile.txt");
            if (obj.createNewFile()) 
            {
                System.out.println("File created: " + obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        	System.out.println("HI! this is codded with Java!!!!!!!");
        }
        catch(IOException e)
        {
            System.out.println("An error has occurred.");
        }
    }
}