package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameModifier {
    public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("ram");
    names.add("sita");
    names.add("hari");
    names.add("shyam");
    names.add("gita");
    names.add("sunil");
    Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(name.startsWith("s")){
                it.remove();
            }

        }
        System.out.println(names);
    }
}
