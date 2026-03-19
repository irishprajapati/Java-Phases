package Advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products implements Comparable<Products> {
    private int price;
    String name;
    private Boolean isAvailable;
    public Products(int price, String name, Boolean isAvailable){
        this.price = price;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Products{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    @Override
    public int compareTo(Products that) {
        if(this.price > that.price) return 1;
        else if (this.price < that.price) {
            return -1;
        }else{
            return 0;
        }
    }
}

public class Product {
    public static void main(String[] args) {
        List<Products> productss = new ArrayList<>();
        productss.add(new Products(1, "datasets",false));
        productss.add(new Products(2, "laptop", true));
        productss.add(new Products(3, "mobile", false));
        productss.add(new Products(7, "tablet", true));
        productss.add(new Products(10, "monitor", false));
        productss.add(new Products(5, "keyboard", true));
        productss.add(new Products(6, "mouse", false));
        productss.add(new Products(9, "printer", true));
        productss.add(new Products(8, "scanner", false));
        for(Products p: productss){
            System.out.println(p);
        }
    }
}
