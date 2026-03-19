package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*basic description of the requirement
class item with String name and price
constructor and integer
@Override toString
check how the public static final vs simple comparator in the code affects the code
*/
class Items{
    private String name;
    private double price;
    public Items(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Product {
    public static void main(String[] args) {
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items("datacable", 10000));
        itemsList.add(new Items("hdmi",2000 ));
        itemsList.add(new Items("charger", 1900));
        itemsList.add(new Items("macbook", 500000));
        Comparator<Items> byPriceDesc = Comparator.comparingDouble(Items::getPrice).reversed();
        itemsList.sort(byPriceDesc);
        for(Items i: itemsList){
            System.out.println(i);
        }
    }
}
