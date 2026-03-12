package List;

import java.util.List;
import java.util.ArrayList;

public class Access {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Hari");
        names.add("Sita");
        System.out.println(names.get(1));
        names.set(1, "Gita");
        names.add(2,"Anisha");
        names.remove(0);
        System.out.println(names);

    }
}
