package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitCounter {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("apple");
        for(String fruit: fruits){
            System.out.println("Before modification: " + fruit);
        }
        Iterator <String> it = fruits.iterator();

    }
}
