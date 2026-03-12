package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Replacement {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("erish");
        names.add("hari");
        names.add("sita");
        names.add("ayush");
        names.add("sumitra");
        names.add("steve");
        for(String name: names){
            System.out.println("Original list of students: " + name);
        }
        names.set(2,"prithivi");
        for(String name: names){
            System.out.println("Modified list: " + name);
        }
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(name.equals("prithivi")){
                it.remove();
            }
            System.out.println(names);
        }
//        System.out.println(names);
    }
}
