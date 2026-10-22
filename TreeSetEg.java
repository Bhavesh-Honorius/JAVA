import java.util.TreeSet;

public class TreeSetEg {
    public static void main(String[] args) {
    TreeSet<String> comp = new TreeSet<String>();
    comp.add("Mouse");
    comp.add("Keyboard");
    comp.add("Monitor");
    comp.add("Mouse");  // Duplicate
    comp.add("Disk");
    System.out.println(comp);
    System.out.println("Size: "+comp.size());

    System.out.println("Usage of contains:"+comp.contains("Phone"));
    System.out.println("Removes");
    comp.remove("Disk");
    System.out.println(comp);
    comp.clear();
    System.out.println("After CLEAR:"+comp);
  }
}
