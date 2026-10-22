import java.util.LinkedList;
public class LinkedListEg {
  public static void main(String[] args) {
    LinkedList<String> food = new LinkedList<String>();
    food.add("Noodle");
    food.add("Chichi");
    food.add("Salad");
    food.add("Sauce");
    System.out.println(food);
    System.out.println("Add at first");
    food.addFirst("Soup");
    System.out.println(food);
    System.out.println("Add at last");
    food.addLast("Cookies");
    System.out.println(food);
    System.out.println("Removing First");
    food.removeFirst();
    System.out.println(food);
    System.out.println("Removing Last");
    food.removeLast();
    System.out.println(food);
    System.out.println("Get First:"+food.getFirst());
    System.out.println("Get Last:"+food.getLast());
  }
}