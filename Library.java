<<<<<<< HEAD
import java.util.Scanner;
class Bag
{
    String bName,gener,author;
    int availablity;
    static int totalBook;
}
class Book extends Bag
{
    static Bag[] bk=new Bag[5];
    void AddBook()
    {
        Scanner sc =new Scanner(System.in);
        boolean l=true;
        int i=0;
        while(l)
        {
            bk[i]=new Bag();
            System.out.print("Enter the book name:");
            bk[i].bName=sc.next();
            System.out.print("Enter the Author Name:");
            bk[i].author=sc.next();
            System.out.print("Enter the book genre:");
            bk[i].gener=sc.next();
            System.out.print("Enter the number of books:");
            bk[i].availablity=sc.nextInt();
            bk[i].totalBook+=bk[i].availablity;
            System.out.println("Do you want to continue(y/n):");
            char c=sc.next().charAt(0);
            if(c=='y')
            {
                i++;
            }
            else
            {
                l=false;
            }
        }
        sc.close();
    }
    void ListBook()
    {

        for(int j=0;j<5;j++)
        {
            System.out.print("book name:"+bk[j].bName);
            System.out.print("Author Name:"+bk[j].author);
            System.out.print("book genre:"+bk[j].gener);
        }
    }
}
class lib extends Book
{
    int borrow(String Book)
    {
        int i,c=0;
        for(i=0;i<5;i++)
        {
            if(bk[i].bName.equals(Book))
            {
                bk[i].availablity--;
                c=1;
                return 1;
            }    
        }
        if(c==0)
        {
            System.out.println("book not available");
            return 0;
        }
        
    }
    int returning(String Book)
    {
        int i,c=0;
        for(i=0;i<5;i++)
        {
            if(bk[i].bName.equals(Book))
            {
                bk[i].availablity++;
                c=1;
                return 1;
            }
        }
        if(c==0)
        {
            System.out.println("book not available");
            return 0;
        }
    }
}
class User extends lib
{
    int userid,count=0;
    String userName,book;
    String[] bookLog = new String[3];
    void getDetail()
    {
            int c;
            String cc;
            boolean l=true;
            Scanner sc = new Scanner(System.in);
            while(l)
            {
            System.out.print("Enter User ID");
            userid=sc.nextInt();
            System.out.print("Enter Name:");
            userName=sc.next();
            System.out.println("1.borrow\n2.return");
            System.out.print("Enter your choise:");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    int b;
                    System.out.print("Enter the book you want to borrow:");
                    book=sc.next();
                    b=borrow(book);
                    if(b==1)
                        bookLog[count++]=book;
                    break;
                case 2:
                    System.out.println("Enter the book you want to return");
                    book=sc.next();
                    returning(book);
                    count--;
                    break;
                default:
                    System.out.print("enter valid option");
            }
            System.out.println("Do you want to continue (y/n)");
            cc=sc.next();
            if(cc.equals("y"));
            else
                l=false;
        }
        sc.close();
    }
    void displayDetail()
    {
        System.out.println("User ID:"+userName);
        System.out.println("Name:"+userName);
        System.out.println("Book borrowed:");
        for(int i=0;i<=count;i++)
        {
            System.out.println(bookLog[i]);
        }
    }   
}

public class Library
{
    public static void main(String[] args)
    {
        int c,ch;
        char cc;
        boolean l=true;
        Scanner sc=new Scanner(System.in);
        while(l)
        {
            System.out.print("1.librarian\n2.student");
            System.out.print("Enter your choise:");
            c=sc.nextInt();
            switch (c) 
            {
                case 1:
                    Book ob=new Book();
                    System.out.println("1.Add Book\n2.list Book");
                    System.out.print("enter choise:");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        ob.AddBook();  
                    }
                    else if(ch==2)
                    {
                        ob.ListBook();
                    }
                    break;
                case 2:
                    User o=new User();
                    o.getDetail();
                default:
                    System.out.println("Enter valid option");
            }
            System.out.println("do you want to continue(y/n)")
            cc=sc.nextChar();
            if(cc.equals('y'))
            else
            {
                l=false;
            }
        }
        sc.close();       
    }
=======
import java.util.Scanner;
class Bag
{
    String bName,gener,author;
    int availablity;
    static int totalBook;
}
class Book extends Bag
{
    static Bag[] bk=new Bag[5];
    void AddBook()
    {
        Scanner sc =new Scanner(System.in);
        boolean l=true;
        int i=0;
        while(l)
        {
            bk[i]=new Bag();
            System.out.print("Enter the book name:");
            bk[i].bName=sc.next();
            System.out.print("Enter the Author Name:");
            bk[i].author=sc.next();
            System.out.print("Enter the book genre:");
            bk[i].gener=sc.next();
            System.out.print("Enter the number of books:");
            bk[i].availablity=sc.nextInt();
            bk[i].totalBook+=bk[i].availablity;
            System.out.println("Do you want to continue(y/n):");
            char c=sc.next().charAt(0);
            if(c=='y')
            {
                i++;
            }
            else
            {
                l=false;
            }
        }
        sc.close();
    }
    void ListBook()
    {

        for(int j=0;j<5;j++)
        {
            System.out.print("book name:"+bk[j].bName);
            System.out.print("Author Name:"+bk[j].author);
            System.out.print("book genre:"+bk[j].gener);
        }
    }
}
class lib extends Book
{
    int borrow(String Book)
    {
        int i,c=0;
        for(i=0;i<5;i++)
        {
            if(bk[i].bName.equals(Book))
            {
                bk[i].availablity--;
                c=1;
                return 1;
            }    
        }
        if(c==0)
        {
            System.out.println("book not available");
            return 0;
        }
        
    }
    int returning(String Book)
    {
        int i,c=0;
        for(i=0;i<5;i++)
        {
            if(bk[i].bName.equals(Book))
            {
                bk[i].availablity++;
                c=1;
                return 1;
            }
        }
        if(c==0)
        {
            System.out.println("book not available");
            return 0;
        }
    }
}
class User extends lib
{
    int userid,count=0;
    String userName,book;
    String[] bookLog = new String[3];
    void getDetail()
    {
            int c;
            String cc;
            boolean l=true;
            Scanner sc = new Scanner(System.in);
            while(l)
            {
            System.out.print("Enter User ID");
            userid=sc.nextInt();
            System.out.print("Enter Name:");
            userName=sc.next();
            System.out.println("1.borrow\n2.return");
            System.out.print("Enter your choise:");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    int b;
                    System.out.print("Enter the book you want to borrow:");
                    book=sc.next();
                    b=borrow(book);
                    if(b==1)
                        bookLog[count++]=book;
                    break;
                case 2:
                    System.out.println("Enter the book you want to return");
                    book=sc.next();
                    returning(book);
                    count--;
                    break;
                default:
                    System.out.print("enter valid option");
            }
            System.out.println("Do you want to continue (y/n)");
            cc=sc.next();
            if(cc.equals("y"));
            else
                l=false;
        }
        sc.close();
    }
    void displayDetail()
    {
        System.out.println("User ID:"+userName);
        System.out.println("Name:"+userName);
        System.out.println("Book borrowed:");
        for(int i=0;i<=count;i++)
        {
            System.out.println(bookLog[i]);
        }
    }   
}

public class Library
{
    public static void main(String[] args)
    {
        int c,ch;
        char cc;
        boolean l=true;
        Scanner sc=new Scanner(System.in);
        while(l)
        {
            System.out.print("1.librarian\n2.student");
            System.out.print("Enter your choise:");
            c=sc.nextInt();
            switch (c) 
            {
                case 1:
                    Book ob=new Book();
                    System.out.println("1.Add Book\n2.list Book");
                    System.out.print("enter choise:");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        ob.AddBook();  
                    }
                    else if(ch==2)
                    {
                        ob.ListBook();
                    }
                    break;
                case 2:
                    User o=new User();
                    o.getDetail();
                default:
                    System.out.println("Enter valid option");
            }
            System.out.println("do you want to continue(y/n)")
            cc=sc.nextChar();
            if(cc.equals('y'))
            else
            {
                l=false;
            }
        }
        sc.close();       
    }
>>>>>>> dbdb035ab62aebba642e253072e457b4cd044537
}