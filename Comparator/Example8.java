package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//describe some fields as null
class Customer{
    private Long id;
    private String name;
    private String city;
    public Customer(Long id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Example8 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1L, "Ram", "Kathmandu"));
        customers.add(new Customer(2L, "Hari", null));
        customers.add(new Customer(3L, "Sita", "Pokhara"));
        customers.add(new Customer(4L, "Asha", null)); //why is it important to mention 1L if id is set as Long field
        Comparator<Customer> byCityNullSafe = Comparator.comparing(Customer::getCity, Comparator.nullsLast(String::compareTo));
        customers.sort(byCityNullSafe);
        for(Customer c: customers){
            System.out.println(c);
        }
    }
}
