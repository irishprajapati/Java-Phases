package Set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateName {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("hari");
        names.add("ram");
        names.add("ram");
        names.add("hari");
        names.add("sita");
        for(String name: names){
            System.out.println(name);
        }
    }
}
