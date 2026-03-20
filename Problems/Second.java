package Problems;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Order {
    private Long id;
    private String status;
    private LocalDateTime createdAt;

    public Order(Long id, String status, LocalDateTime createdAt) {
        this.id = id;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public String getStatus() { return status; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class Second {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(1L, "URGENT", LocalDateTime.of(2026, 3, 19, 9, 30)));
        orderList.add(new Order(2L, "PENDING", LocalDateTime.of(2026, 3, 19, 11, 15)));
        orderList.add(new Order(3L, "PROCESSING", LocalDateTime.of(2026, 3, 19, 14, 45)));
        orderList.add(new Order(4L, "DONE", LocalDateTime.of(2026, 3, 19, 16, 0)));
        orderList.add(new Order(5L, "URGENT", LocalDateTime.of(2026, 3, 19, 8, 20)));    // earlier urgent
        orderList.add(new Order(6L, "PENDING", LocalDateTime.of(2026, 3, 19, 12, 0)));
        orderList.add(new Order(7L, "PROCESSING", LocalDateTime.of(2026, 3, 19, 10, 10)));
        orderList.add(new Order(8L, "DONE", LocalDateTime.of(2026, 3, 19, 18, 30)));
        orderList.add(new Order(9L, "URGENT", LocalDateTime.of(2026, 3, 19, 7, 50)));    // earliest urgent
        orderList.add(new Order(10L, "PENDING", LocalDateTime.of(2026, 3, 19, 15, 25)));
        Comparator<Order> orderComparator = Comparator.comparing(Order::getStatus).thenComparing(Order::getCreatedAt);

    }
}