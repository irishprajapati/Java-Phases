package List;

import java.util.ArrayList;
import java.util.List;

public class LowerCase {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ERISH");
        names.add("SEPHORA");
        names.add("JUSTIN");
        System.out.println("Original list: " + names);
        names.replaceAll(String::toLowerCase);
        System.out.println("UpperCase List: "+ names);
    }
}

