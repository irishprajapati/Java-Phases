package Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product>{
    private Long id;
    private String name;
    private int price;
    public Product(Long id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.getPrice(), other.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class first {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L, "Cream", 1200));
        productList.add(new Product(2L, "Soap", 200));
        productList.add(new Product(3L, "Shampoo", 800));
        productList.add(new Product(4L, "Cream", 1500));     // same name, different price
        productList.add(new Product(5L, "Soap", 200));       // exact duplicate (name + price)
        productList.add(new Product(6L, "Lotion", 1200));    // same price as Cream
        productList.add(new Product(7L, "Conditioner", 800)); // same price as Shampoo
        productList.add(new Product(8L, "cream", 1200));     // case difference (forces case-insensitive sort)
        productList.add(new Product(9L, "Facewash", 500));
        productList.add(new Product(10L, "Soap", 100));      // same name, different price
        Comparator<Product> productComparator = Comparator.comparing(Product::getPrice, Comparator.reverseOrder()).thenComparing(Product::getName,String.CASE_INSENSITIVE_ORDER);
        productList.sort(productComparator);
        for(Product data: productList){
            System.out.println(data);
        }
    }
}

