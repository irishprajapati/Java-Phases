package Claude;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Order{
private Long id;
private int priority;
private LocalDateTime createdAt;
public Order(Long id, int priority, LocalDateTime createdAt){
    this.id = id;
    this.priority = priority;
    this.createdAt = createdAt;
}

    public Long getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", priority=" + priority +
                ", createdAt=" + createdAt +
                '}';
    }
}
public class Business {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101L, 2, LocalDateTime.of(2026, 3, 19, 10, 0)));
        orders.add(new Order(102L, 3, LocalDateTime.of(2026, 3, 19, 9, 0)));
        orders.add(new Order(103L, 3, LocalDateTime.of(2026, 3, 19, 8, 0)));
        orders.add(new Order(104L, 1, LocalDateTime.of(2026, 3, 19, 7, 0)));
        Comparator<Order> orderComparator = Comparator.comparingInt(Order::getPriority).reversed().thenComparing(Order::getCreatedAt).thenComparingLong(Order::getId);
        orders.sort(orderComparator);
        for(Order data: orders){
            System.out.println(data);
        }
    }

}
