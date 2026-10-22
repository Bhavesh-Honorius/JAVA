class ArrayOutOfBound
{
    public static void main(String[] args) 
    {
        int[] number={1,2,3};
        try
        {
            System.out.println(number[5]);
        }   
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception caught:"+e);
        }
        finally
        {
            System.out.println("exception handled");
        }
        System.out.println("End of program");
    }
}