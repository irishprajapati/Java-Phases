package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operation {
    //stateful and stateless operation
    public static void main(String[] args) {
        List<String>names = Arrays.asList("heroic", "astronaut", "satwik", "bobleyyy");
        Stream<String> stream = names.stream().filter(name-> {
            System.out.println("filtering names: " + name);
            return name.length() > 3;
        });
        System.out.println("Before terminal operation: ");
        List<String> result = stream.collect(Collectors.toList());
        System.out.println("After terminal operation: " + result);
        System.out.println(result);
    }
}
