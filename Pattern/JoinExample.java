package Pattern;

import java.util.*;

/*
* make user class with fields id and String name- done
* constructor for user + getter method - done
* class Order with field long id and user LongId double amount-done
* constructor + getter method-done
* main class requirements:
*  list for user
* insert with arrays.aslist()
* another list for orders
* map to get the user id with String integer value to Long and user value
* enhanced for loops for the user.getID and user
* for orders also using enhanced for loops
* */
class User{
    // id is declared as int because id in real system are often auto increment from database
    private Long id;
    private String name;
    //constructor initialization
    public User(Long id, String name){
        //holds the value for the lifetime unless setter changes it
        this.id = id;
        this.name = name;
    }
    //getter method
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Order{
    private Long id;
    private Long userId;
    private double amount;
    public Order(Long id, Long userId, double amount){
        this.id = id;
        this.userId = userId;
        this.amount = amount;
    }
    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", amount=" + amount +
                '}';
    }
}
public class JoinExample {
    public static void main(String[] args) {
        List<User> userlist = Arrays.asList(
                new User(1L, "Erish"),
                new User(2L,"samyam"),
                new User(3L, "prithivi")
        );
        List<Order> orderList = Arrays.asList(
                new Order(101L, 1L,1900.99),
                new Order(201L, 2L, 19099),
                new Order(200L,4L,988888)
        );
        Map<Long, User> userById = new HashMap<>();
        for(User user: userlist){
            userById.put(user.getId(), user);
        }
        for(Order order: orderList){
            User user = userById.get(order.getUserId());
                if( user != null){
                    System.out.println("Order: " + order.getId() + " belongs to " + user.getName() + " amount: " + order.getAmount());
                }
        }
    }
}
