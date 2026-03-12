package Set;

import java.util.HashSet;
import java.util.Set;

public class first {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("hari");
        names.add("ramhari");
        names.add("krishna");
        names.add("ramhari");//this one is not printed as output
        System.out.println(names);
    }
}
