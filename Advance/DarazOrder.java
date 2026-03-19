package Advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Items implements Comparable<Items>{
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
    @Override
    public int compareTo(Items other){
        return Double.compare(this.price, other.price);
    }
}
public class DarazOrder {
    public static void main(String[] args) {
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items("Laptopp", 190000.99));
        itemsList.add(new Items("phone", 90000));
        itemsList.add(new Items("Tv", 8990));
        Collections.sort(itemsList);
        for(Items i: itemsList){
            System.out.println(i);
        }
    }

}
