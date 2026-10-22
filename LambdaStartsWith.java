import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class LambdaStartsWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Paul", "Mary", "John", "Alice");
        List<String> filteredNames = names.stream()
        .filter(name -> name.startsWith("P"))
        .collect(Collectors.toList());
        filteredNames.forEach(name -> System.out.println(name));
    }
}
