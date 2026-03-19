package Pattern;

import java.util.*;

class Userr{
    private Long id;
    private String name;
    public Userr(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Userr userr = (Userr) o;
        return Objects.equals(id, userr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Userr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Product{
    private Long id;
    private Long userId;
    private String category;
    private double price;
    public Product(Long id, Long userId, String category, double price){
        this.id = id;
        this.userId = userId;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", userId=" + userId +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
class Orderr{
    private Long id;
    private Long userId;
    private  Long productId;
    private int quantity;
    private String status;
    private String OrderDate;
    public Orderr(Long id, Long userId, Long productId, int quantity, String status, String OrderDate){
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity =  quantity;
        this.status = status;
        this.OrderDate = OrderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Orderr orderr = (Orderr) o;
        return Objects.equals(id, orderr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Orderr{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", OrderDate='" + OrderDate + '\'' +
                '}';
    }
}

public class OrderAnalytics {
    public static void main(String[] args) {
//        List<Userr> users = Arrays.asList(
//                new Userr(1L,"erish"),
//                new Userr(2L,"amita"),
//                new Userr(3L, "santosh"),
//                new Userr(3l, "kiran")
//        );
//        how this map can be fit for the look up data in rows of large data
        Map<Integer, Userr> userrMap = new HashMap<>();
        userrMap.put(1, new Userr(1L, "erish"));
        userrMap.put(2, new Userr(2L, "sanotsh"));
        userrMap.put(3, new Userr(3L, "avarika"));
        userrMap.put(4, new Userr(4L, "avantika"));
        userrMap.put(5, new Userr(5L, "salin"));
        Map<Integer, Orderr> orderrMap = new HashMap<>();
        orderrMap.put(1, new Orderr(1L, 1L, 1L, 2, "PAID", "2021-09-07"));
        orderrMap.put(2, new Orderr(2L, 1L, 2L, 1, "PAID", "2021-09-08"));   // same user (1) multiple orders
        orderrMap.put(3, new Orderr(3L, 2L, 1L, 5, "CANCELLED", "2021-09-09")); // CANCELLED order
        orderrMap.put(4, new Orderr(4L, 2L, 3L, 1, "PAID", "2021-09-10"));      // same user (2)
        orderrMap.put(5, new Orderr(5L, 3L, 2L, 3, "PAID", "2021-09-11"));
        orderrMap.put(6, new Orderr(6L, 3L, 3L, 4, "PAID", "2021-09-12"));      // same user (3)
        orderrMap.put(7, new Orderr(7L, 4L, 1L, 2, "PAID", "2021-09-13"));      // product 1 repeated
        orderrMap.put(8, new Orderr(8L, 5L, 4L, 1, "PAID", "2021-09-14"));
    }
}
