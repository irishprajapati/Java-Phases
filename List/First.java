package List;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Hari");
        names.add("Sita");
        names.add("Gita");
        names.add("Shyam");
        System.out.println(names);
        names.remove("Ram");//removed the name ram from array list
        System.out.println(names);
        System.out.println(names.size());//why it doesnt print the size
        System.out.println(names);
    }
}
