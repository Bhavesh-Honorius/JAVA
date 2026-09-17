class InvalidAgeException extends Exception 
{
    String message;    
    public InvalidAgeException(String m2) 
    {
        message = m2;  
    }
    @Override
    public String toString() 
    { 
        return ("Exception Occurred: " + message) ;
    }
}
public class CustomException 
{
    public static void main(String[] args) 
    {
	    int age=12;
        try 
        {
            if (age < 18)
           		throw new InvalidAgeException("Age must be 18 or above.");
		    else
			    System.out.println("Eligible to Vote!!");
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println("Caught Exception: " + e);
        }
    }
}
