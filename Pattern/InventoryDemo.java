package Pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InventoryDemo {
    /*first make the hashmap
    inventory
    put some data using .put()
    check if one product exists or not but first make the product

    */
    public static void main(String[] args) {
        Map<String, Integer> inventory = new ConcurrentHashMap<>();
        inventory.put("Laptop",1);
        inventory.put("phone", 2);
        inventory.put("mac mini",3);
        inventory.put("cameras",4);
        String product = "cameras";
        if(inventory.containsKey(product)){
            int data = inventory.get(product);
            inventory.put(product, data);
        }
        for(Map.Entry<String, Integer> entry: inventory.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
