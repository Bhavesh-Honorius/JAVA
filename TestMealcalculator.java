import java.util.Scanner;
class Meal
{
    int totalCalories=0;

}
class Breakfast extends Meal
{
    String name;
    int Calories;
    void Bcalc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the meal name:");
        name = sc.next();
        System.out.println("Enter the total calories:");
        Calories+=sc.nextInt();
        totalCalories+=Calories;
    }

}
class Lunch extends Meal
{
    String name;
    int Calories;
    void Lcalc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the meal name:");
        name = sc.next();
        System.out.println("Enter the total calories:");
        Calories+=sc.nextInt();
        totalCalories+=Calories;
    }
}
class Snacks extends Meal
{
    String name;
    int Calories;
    void Scalc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the meal name:");
        name = sc.next();
        System.out.println("Enter the total calories:");
        Calories+=sc.nextInt();
        totalCalories+=Calories;
    }
}
class Dinner extends Meal
{
    String name;
    int Calories;
    void Dcalc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the meal name:");
        name = sc.next();
        System.out.println("Enter the total calories:");
        Calories+=sc.nextInt();
        totalCalories+=Calories;
    }
}
class Week
{
    Meal[] m=new Meal[7];
    Breakfast[] b=new Breakfast[7];
    Lunch[] l=new Lunch[7];
    Snacks[] s=new Snacks[7];
    Dinner[] d=new Dinner[7];
    int v=0;
    void GetFoodData() 
    {
        for(int i=0;i<7;i++)
        {
            m[i]=new Meal();
            b[i]=new Breakfast();
            l[i]=new Lunch();
            s[i]=new Snacks();
            d[i]=new Dinner();
        }
        Scanner sc=new Scanner(System.in);
        int c;
        boolean L=true;
        for(int i=0;i<7;i++)
        {
            
            System.out.println("DAY "+i);
            while(L)
            {
                v++;
                System.out.println(" 1.Break Fast\n 2.Lunch\n 3.Snacks\n 4.Dinner\n 5.End the week");
                c=sc.nextInt();
                switch(c)
                {
                    case 1:
                        b[i].Bcalc();
                        break;
                    case 2:
                        l[i].Lcalc();
                        break;
                    case 3:
                        s[i].Scalc();
                        break;
                    case 4:
                        d[i].Dcalc();
                        break;
                    case 5:
                        L=false;
                        v--;
                        break;
                    default:
                        System.out.println("Enter valid choise...");
                }
            }
        }
    }
    void weekDisplay()
    {
        for(int i=0;i<v;i++)
        {
            System.out.println("DAY "+i);
            System.out.println("Total calories intake in Breakfast: "+b[i].Calories);
            System.out.println("Total calories intake in Lunch: "+l[i].Calories);
            System.out.println("Total calories intake in Snacks: "+s[i].Calories);
            System.out.println("Total calories intake in Dinner: "+d[i].Calories);
            System.out.println("THE TOTAL CALORIES OF THE DAY IS :"+m[i].totalCalories);
        }
    }
}
public class TestMealcalculator
{
    public static void main(String[] args) 
    {
        Week w=new Week();
        w.GetFoodData();
        w.weekDisplay();
    }
}