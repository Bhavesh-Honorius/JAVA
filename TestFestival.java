import java.util.Scanner;
interface Feast
{
    public void Recipe();
    void Cost();
}
class Onam implements Feast
{
    Onam()
    {
        Welcome();
        Cost();
        Recipe();
    }
    void Welcome()
    {
        System.out.println("Happy Onam");
    }
    @Override
    public void Recipe()
    {
        System.out.println("Sadhya Recipe");
        System.out.println("Step1:ingnite the stove\nStep2:make the water to boil in a pot\nStep3:when the water started to boid add rice");
        System.out.println("Step4:After the rice cooked drain the water\n step5: serve with side dishes and payassam");
        System.out.println("____________________________________________\n");
    }
    public void Cost()
    {
        Scanner sc=new Scanner(System.in);
        int count,totalCost,makingCharge=100,IngredientsCost=200;
        System.out.print("Enter the count of people:");
        count=sc.nextInt();
        System.out.println("making charge per count: "+makingCharge);
        System.out.println("Ingredient charge per count: "+IngredientsCost);
        totalCost= count*(makingCharge+IngredientsCost);
        System.out.println("The total cost for making: "+totalCost);
    }
}
class Ramzan implements Feast
{
    Ramzan()
    {
        Welcome();
        Cost();
        Recipe();
    }
   void Welcome()
    {
        System.out.println("Happy Ramzan");
    }
    @Override
    public void Recipe()
    {
        System.out.println("Biriyani Recipe");
        System.out.println("Step1:ingnite the stove\nStep2:add in a pot\nStep3:add tomato\nStep4:add spices and chicken");
        System.out.println("Step5:after partial cooking by adding water add rice\n step6: serve the biriyani");
        System.out.println("____________________________________________\n");
    }
    @Override
    public void Cost()
    {
        Scanner sc=new Scanner(System.in);
        int count,totalCost,makingCharge=100,IngredientsCost=200;
        System.out.print("Enter the count of people:");
        count=sc.nextInt();
        System.out.println("making charge per count: "+makingCharge);
        System.out.println("Ingredient charge per count: "+IngredientsCost);
        totalCost= count*(makingCharge+IngredientsCost);
        System.out.println("The total cost for making: "+totalCost);
    }  
}
class Christmas implements Feast
{
    Christmas()
    {
        Welcome();
        Cost();
        Recipe();
    }
    void Welcome()
    {
        System.out.println("Merry Christmas");
    }
    @Override
    public void Recipe()
    {
        System.out.println("Roasted Turkey and glazed Ham");
        System.out.println("Step1:Stuff the turkey with vegetabel and spices\nStep2:rost the turkey in a apple wood flame\nStep3:mix and marinate the Ham with spices");
        System.out.println("Step4:grill the ham\n step5: glaze the ham with the sause make with spices and honey\nStep6:serve the Turkey and glazed Ham");
        System.out.println("____________________________________________\n");
    }
    @Override
    public void Cost()
    {
        Scanner sc=new Scanner(System.in);
        int count,totalCost,makingCharge=100,IngredientsCost=200;
        System.out.print("Enter the count of people:");
        count=sc.nextInt();
        System.out.println("making charge per count: "+makingCharge);
        System.out.println("Ingredient charge per count: "+IngredientsCost);
        totalCost= count*(makingCharge+IngredientsCost);
        System.out.println("The total cost for making: "+totalCost);
    }
}
class Userchoise
{
    void getchoise()
    {
        Scanner sc=new Scanner(System.in);
        int c;
        boolean l=true;
        while(l)
        {
            System.out.println("1.Onam \n 2.Ramzan\n 3.Christmas");
            System.out.print("Enter your choise:");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    Onam o=new Onam();
                    break;
                case 2:
                    Ramzan r=new Ramzan();
                    break;
                case 3:
                    Christmas ch=new Christmas();
                    break;
                case 4:
                    l=false;
                    break;
                default:
                    System.out.println("Enter valid choise...");
            }
        }
    }
}
public class TestFestival
{
    public static void main(String[] args)
    {
        Userchoise c=new Userchoise();
        c.getchoise();
    }
}