import java.io.FileWriter;
import java.io.IOException;
public class FileWrite 
{ 
    public static void main(String[] args) {
        try
        {
        	FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("hi every one welcome to java ");
            Writer.close();
        	System.out.println("HI! this is codded with Java!!!!!!!");
        }
        catch(IOException e)
        {
            System.out.println("An error has occurred."+e);
        }
    }
}