package List;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("ram");
        names.add("shyam");
        names.add("salina");
        System.out.println("Original list: " + names);
        names.replaceAll(String::toUpperCase);
        System.out.println("UpperCase List: "+ names);

    }
}
