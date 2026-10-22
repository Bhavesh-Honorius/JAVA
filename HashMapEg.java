import java.util.HashMap;
import java.util.Map;

public class HashMapEg{
    
    public static void main(String[] args){

        // Create a HashMap
        HashMap<String, Integer> data = new HashMap<>();

        // Add elements to the HashMap
        data.put("John", 25);
        data.put("Jane", 30);
        data.put("Jim", 35);

        System.out.println(data);
        // Iterate through the HashMap
         for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
       for (String i : data.keySet()) {
            System.out.println(i);
        }
    }
}