package List;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Phone");
        products.add("Mouse");
        products.add("Keyboard");
        for(String product: products){
            System.out.println(product);
        }
        System.out.println(products.contains("Phone"));
    }
}
