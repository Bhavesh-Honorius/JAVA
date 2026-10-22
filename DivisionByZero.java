<<<<<<< HEAD
class DivisionByZero
{
    public static void main(String [] args)
    {
        int n=10;
        int m=0;
        try
        {
            int ans=n/m;
            System.out.println("Answer:"+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:Division by 0");
        }
    }
=======
class DivisionByZero
{
    public static void main(String [] args)
    {
        int n=10;
        int m=0;
        try
        {
            int ans=n/m;
            System.out.println("Answer:"+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:Division by 0");
        }
    }
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
}