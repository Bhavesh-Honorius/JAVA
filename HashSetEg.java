import java.util.HashSet;
public class HashSetEg {
  public static void main(String[] args) {
    HashSet<String> comp = new HashSet<String>();
    comp.add("Mouse");
    comp.add("Keyboard");
    comp.add("Monitor");
    comp.add("Mouse");  // Duplicate
    comp.add("Disk");
    System.out.println(comp);
    System.out.println("Size: "+comp.size());

    System.out.println("Usage of contains:"+comp.contains("Phone"));
    System.out.println("Removes");
    comp.remove("Volvo");
    System.out.println(comp);
    comp.clear();
    System.out.println("After CLEAR:"+comp);
  }
}