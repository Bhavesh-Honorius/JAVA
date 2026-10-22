<<<<<<< HEAD
import java.util.Scanner;
class Salary
{
    int basicPay=50000;
    double hra,da,pf,pt,gross,net;
    String name;
    int employeeID;
    void Calculations()
    {
        double add=hra+da;
        double tax=pf + pt;
        gross=basicPay+add;
        net= gross-tax;
        PrintSlip();
    }
    void PrintSlip()
    {
        System.out.println("\t name: "+name);
        System.out.println("\t Employe ID: "+employeeID);
        System.out.println("Basic pay: "+basicPay);
        System.out.println("House Rental Allowance: "+hra);
        System.out.println("Dearness Allowance: "+da);
        System.out.println("Provident Fund: "+pf);
        System.out.println("Professional Tax: "+pt);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
        System.out.println("________________________");
    }
}
class Programmer extends Salary
{
    Programmer(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class AssistantProfessor extends Salary
{
    AssistantProfessor(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class AssociateProfessor extends Salary
{
    AssociateProfessor(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class Professor extends Salary
{
    Professor(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class GetDetails
{
    Scanner sc= new Scanner(System.in);
    String n;
    int Eid,c;
    void getD()
    {
        System.out.print("Enter the name:");
        n=sc.next();
        System.out.print("Enter the employee Id:");
        Eid=sc.nextInt();
        System.out.println("\n_____________________________");
    }
    void getC()
    {
        System.out.println("1.Programmer\n2.Assistant Professor\n3.Assocoate Professor\n4.professor\n5.exit");
        System.out.println("Enter your choise:");
        c=sc.nextInt();
    }
    void CloseScanner()
    {
        sc.close();
    }
}
public class Payslip
{
    public static void main(String [] args)
    { 
        boolean l=true;
        GetDetails gd=new GetDetails();
        while (l)
        {
            gd.getC();
            if(gd.c>=1 && gd.c<=4)
                gd.getD();
            switch (gd.c) 
            {
            case 1:
                Programmer p=new Programmer(gd.n,gd.Eid,50,20,10,200);
                break;
            case 2:
                AssistantProfessor aspr=new AssistantProfessor(gd.n,gd.Eid,45,15,10,100);
                break;
            case 3:
                AssociateProfessor apr=new AssociateProfessor(gd.n,gd.Eid,40,10,10,100);
                break;
            case 4:
                Professor pr=new Professor(gd.n,gd.Eid,30,15,5,100);
                break;
            case 5:
                l=false;
                gd.CloseScanner();
                break;
            default:
                System.out.println("Enter valid choise.....");    
        }
        }
    }
=======
import java.util.Scanner;
class Salary
{
    int basicPay=50000;
    double hra,da,pf,pt,gross,net;
    String name;
    int employeeID;
    void Calculations()
    {
        double add=hra+da;
        double tax=pf + pt;
        gross=basicPay+add;
        net= gross-tax;
        PrintSlip();
    }
    void PrintSlip()
    {
        System.out.println("\t name: "+name);
        System.out.println("\t Employe ID: "+employeeID);
        System.out.println("Basic pay: "+basicPay);
        System.out.println("House Rental Allowance: "+hra);
        System.out.println("Dearness Allowance: "+da);
        System.out.println("Provident Fund: "+pf);
        System.out.println("Professional Tax: "+pt);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
        System.out.println("________________________");
    }
}
class Programmer extends Salary
{
    Programmer(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class AssistantProfessor extends Salary
{
    AssistantProfessor(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class AssociateProfessor extends Salary
{
    AssociateProfessor(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class Professor extends Salary
{
    Professor(String name,int employeeID,int hra ,int da,int pf,int pt)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.hra=basicPay *(hra/100.0);
        this.da=basicPay *(da/100.0);
        this.pf=basicPay *(pf/100.0);
        this.pt=pt;
        Calculations();
    }
}
class GetDetails
{
    Scanner sc= new Scanner(System.in);
    String n;
    int Eid,c;
    void getD()
    {
        System.out.print("Enter the name:");
        n=sc.next();
        System.out.print("Enter the employee Id:");
        Eid=sc.nextInt();
        System.out.println("\n_____________________________");
    }
    void getC()
    {
        System.out.println("1.Programmer\n2.Assistant Professor\n3.Assocoate Professor\n4.professor\n5.exit");
        System.out.println("Enter your choise:");
        c=sc.nextInt();
    }
    void CloseScanner()
    {
        sc.close();
    }
}
public class Payslip
{
    public static void main(String [] args)
    { 
        boolean l=true;
        GetDetails gd=new GetDetails();
        while (l)
        {
            gd.getC();
            if(gd.c>=1 && gd.c<=4)
                gd.getD();
            switch (gd.c) 
            {
            case 1:
                Programmer p=new Programmer(gd.n,gd.Eid,50,20,10,200);
                break;
            case 2:
                AssistantProfessor aspr=new AssistantProfessor(gd.n,gd.Eid,45,15,10,100);
                break;
            case 3:
                AssociateProfessor apr=new AssociateProfessor(gd.n,gd.Eid,40,10,10,100);
                break;
            case 4:
                Professor pr=new Professor(gd.n,gd.Eid,30,15,5,100);
                break;
            case 5:
                l=false;
                gd.CloseScanner();
                break;
            default:
                System.out.println("Enter valid choise.....");    
        }
        }
    }
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
}