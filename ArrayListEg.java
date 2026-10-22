import java.util.*;  
public class ArrayListEg {  
    public static void main(String[] args) 
    {  
        ArrayList<String> alist = new ArrayList<>();    
        alist.add("Ajay");  
        alist.add("Pradnesh");  
        alist.add("Kaarun");  
        System.out.println(alist);
        System.out.println(alist.get(1));  
        System.out.println("After adding an element");
        alist.add(0, "shidik"); 
        for(String s:alist)
        {
            System.out.print(" "+ s);
        }
        alist.set(2, "Jerry");
        System.out.println("\n After modification");
        for(String s:alist)
        {
            System.out.print(" "+ s);
        }
        alist.remove(1);
        System.out.println("\n After Removal");
        for(String s:alist)
        {
            System.out.print(" "+ s);
        }
        System.out.println("\n Finding Size: " + alist.size());
    }  
}  