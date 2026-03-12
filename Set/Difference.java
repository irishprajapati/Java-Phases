package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Difference {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Set<String> fruits = new HashSet<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("orange");
        names.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        for(String name: names){
            System.out.println("List data: " + name);
        }
        for(String fruit: fruits){
            System.out.println("Set data: " +  fruit);
        }
    }
}
